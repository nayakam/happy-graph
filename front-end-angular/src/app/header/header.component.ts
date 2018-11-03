import {Component, Input, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {AppRoutes} from '../app-routing.module';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  @Input()
  private username: String = '';

  public constructor(private router: Router) {
  }

  ngOnInit() {
  }

  public logOut(): void {
    this.router.navigate([AppRoutes.EMPTY]);
  }
}
