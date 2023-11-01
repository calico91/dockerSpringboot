import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LayoutPageComponent } from './pages/layout-page/layout-page.component';
import { NewPageComponent } from './pages/new-page/new-page.component';
import { SearchPageComponent } from './pages/search-page/search-page.component';
import { ListPageComponent } from './pages/list-page/list-page.component';
import { ClientePageComponent } from './pages/cliente-page/cliente-page.component';


// localhost:4200/heroes
const routes: Routes = [
  {
    path: '',
    component: LayoutPageComponent,
    children: [
      { path: 'nuevo-cliente', component: NewPageComponent },
      { path: 'search', component: SearchPageComponent },
      { path: 'modificar-cliente/:id', component: NewPageComponent },
      { path: 'consultar-cliente', component: ListPageComponent },
      { path: ':id', component: ClientePageComponent },
      { path: '**', redirectTo: 'consultar-cliente' },
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ClienteRoutingModule { }
