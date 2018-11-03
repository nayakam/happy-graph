import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {LoginComponent} from './login/login.component';
import {HomeComponent} from './home/home.component';

export class AppRoutes {
  public static LOGIN: string = 'login';
  public static EMPTY: string = '';
  public static HOME: string = 'home';
  public static ABOUT: string = 'about';
  public static CONTACT: string = 'contact';
}

const routes: Routes = [
  {path: AppRoutes.LOGIN, component: LoginComponent},
  {path: AppRoutes.EMPTY, component: LoginComponent},
  {path: AppRoutes.HOME, component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
