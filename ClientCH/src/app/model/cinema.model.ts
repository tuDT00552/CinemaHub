import {MovieModel} from './movie.model';
import {RoomModel} from './room.model';
export class CinemaModel {
  id?: number;
  marap?: string;
  tenrap?: string;
  diachi?: string;
  gioithieurap?: string;
  status?: number;
  createdAt?: Date;
  updateAt?: Date;
  movies?: MovieModel[];
  roomEntities?: RoomModel[];
}
