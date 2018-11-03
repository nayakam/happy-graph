import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {AppRoutes} from '../app-routing.module';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  private username: String = '';
  private password: String = '';

  public ngOnInit() {
  }

  public constructor(private router: Router) {
  }

  private login(): void {
    if (this.username === 'admin' && this.password === 'admin') {
      this.router.navigate([AppRoutes.HOME]);
    } else {
      alert('Invalid Credentials');
    }
  }

}
