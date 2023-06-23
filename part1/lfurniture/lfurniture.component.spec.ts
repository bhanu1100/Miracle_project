import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LfurnitureComponent } from './lfurniture.component';

describe('LfurnitureComponent', () => {
  let component: LfurnitureComponent;
  let fixture: ComponentFixture<LfurnitureComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LfurnitureComponent]
    });
    fixture = TestBed.createComponent(LfurnitureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
