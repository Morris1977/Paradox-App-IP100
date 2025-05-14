package com.Paradox;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

class r extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ DraggableListView a;

    r(DraggableListView draggableListView) {
        this.a = draggableListView;
    }

    public void onLongPress(MotionEvent motionEvent) {
        int y = (int) motionEvent.getY();
        int pointToPosition = this.a.pointToPosition((int) motionEvent.getX(), y);
        if (pointToPosition != -1) {
            if (this.a.g != null) {
                this.a.g.a();
                this.a.g = null;
            }
            View childAt = this.a.getChildAt(pointToPosition - this.a.getFirstVisiblePosition());
            childAt.setPressed(false);
            this.a.g = new t(this.a, this.a.getContext());
            this.a.g.a(y, ((int) motionEvent.getRawY()) - y, childAt);
            this.a.b = pointToPosition;
            this.a.c = this.a.b;
            int height = this.a.getHeight();
            this.a.d = Math.min(y - this.a.f, height / 3);
            this.a.e = Math.max(y + this.a.f, (height * 2) / 3);
        }
    }
}
