import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user.model';
import { HttpClientService } from '../../services/http-client.service';


@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit{
  users: Array<User> = [];


  constructor(private httpClientService: HttpClientService) { }

  ngOnInit() {
    this.httpClientService.getUsers().subscribe(
      (      response: any) => this.handleSuccessfulResponse(response),
    );
  }

  handleSuccessfulResponse(response: User[]) {
    this.users = response;
  }
}