import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LwomenComponent } from './lwomen.component';

describe('LwomenComponent', () => {
  let component: LwomenComponent;
  let fixture: ComponentFixture<LwomenComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LwomenComponent]
    });
    fixture = TestBed.createComponent(LwomenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
