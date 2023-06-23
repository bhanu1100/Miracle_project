import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompsComponent } from './comps.component';

describe('CompsComponent', () => {
  let component: CompsComponent;
  let fixture: ComponentFixture<CompsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CompsComponent]
    });
    fixture = TestBed.createComponent(CompsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
