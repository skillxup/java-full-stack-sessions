import { Component, ViewContainerRef, ComponentFactoryResolver } from '@angular/core';

@Component({
  selector: 'app-lazyloading',
  template: `
    <div class='row'>
      <div class='col-sm-12'>
        <h4>Understanding about LazyLoading</h4>
        
        <button type='button' class='btn btn-info mb-3 me-3' (click)='loadLazy1()'> loading lazy1 component </button>

        <button type='button' class='btn btn-info mb-3 me-3' (click)='loadLazy2()'> loading lazy2 component </button>
      </div>
    </div>
  `,
  styleUrls: ['./lazyloading.component.css']
})
export class LazyloadingComponent {

  constructor(
    private viewContainerRef: ViewContainerRef, 
    private componentFactoryResolver: ComponentFactoryResolver
  ) { }

  async loadLazy1() {
    this.viewContainerRef.clear();
    const { Loadlazy1Component } = await import("./loadlazy1/loadlazy1.component");
    this.viewContainerRef.createComponent(
      this.componentFactoryResolver.resolveComponentFactory(Loadlazy1Component)
    );
  }

  async loadLazy2() {
    this.viewContainerRef.clear();
    const { Loadlazy2Component } = await import("./loadlazy2/loadlazy2.component");
    this.viewContainerRef.createComponent(
      this.componentFactoryResolver.resolveComponentFactory(Loadlazy2Component)
    );
  }

}
