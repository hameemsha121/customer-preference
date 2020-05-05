import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CustomerPreferenceComponent } from './customer-preference/customer-preference.component';
import { AdminComponent } from './admin/admin.component';
import { GenerateReportComponent } from './generate-report/generate-report.component';


const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'customer-preference', component: CustomerPreferenceComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'generate', component: GenerateReportComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
