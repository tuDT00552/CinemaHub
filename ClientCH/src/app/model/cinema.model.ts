import {MovieModel} from "./movie.model";

export class CinemaModel {
  id?: number;
  marap?: string;
  tenrap?: string;
  diachi?: string;
  gioithieurap?: string;
  status?: number;
  createdAt?: number;
  updateAt?: number;
  movies?: MovieModel[];
}

