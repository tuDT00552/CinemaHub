import {Inject, Injectable} from '@angular/core';
import {LOCAL_STORAGE, StorageService} from "ngx-webstorage-service";


let STORAGE_KEY;
STORAGE_KEY = 'local_todolist';
@Injectable({
  providedIn: 'root'
})
export class LocalStorageService {

  anotherTodolist = [];
  constructor(@Inject(LOCAL_STORAGE) private storage: StorageService) { }

  public storeOnLocalStorage(taskTitle: string): void {

    // get array of tasks from local storage
    const currentTodoList = this.storage.get(STORAGE_KEY) || [];
    // push new task to array
    currentTodoList.push({
      title: taskTitle,
      isChecked: false
    });
    // insert updated array to local storage
    this.storage.set(STORAGE_KEY, currentTodoList);
    console.log(this.storage.get(STORAGE_KEY) || 'Local storage is empty');
  }
}
