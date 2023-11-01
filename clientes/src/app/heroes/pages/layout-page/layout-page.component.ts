import { Component } from '@angular/core';

@Component({
  selector: 'app-layout-page',
  templateUrl: './layout-page.component.html',
  styles: [
  ]
})
export class LayoutPageComponent {

  public sidebarItems = [
    { label: 'Listado', icon: 'label', url: './consultar-cliente' },
    { label: 'Añadir', icon: 'add', url: './nuevo-cliente' },
    { label: 'Buscar', icon: 'search', url: './search' },
  ]

}
