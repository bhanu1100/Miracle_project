import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LelectronicsComponent } from './lelectronics.component';

describe('LelectronicsComponent', () => {
  let component: LelectronicsComponent;
  let fixture: ComponentFixture<LelectronicsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LelectronicsComponent]
    });
    fixture = TestBed.createComponent(LelectronicsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
