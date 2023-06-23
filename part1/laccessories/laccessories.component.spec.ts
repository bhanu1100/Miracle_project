import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LaccessoriesComponent } from './laccessories.component';

describe('LaccessoriesComponent', () => {
  let component: LaccessoriesComponent;
  let fixture: ComponentFixture<LaccessoriesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LaccessoriesComponent]
    });
    fixture = TestBed.createComponent(LaccessoriesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
