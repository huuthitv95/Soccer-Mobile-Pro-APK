package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.view.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3074ri extends SnapHelper {

    /* JADX INFO: renamed from: ik */
    private RecyclerView f9640ik;

    /* JADX INFO: renamed from: lr */
    private OrientationHelper f9641lr;

    /* JADX INFO: renamed from: ri */
    private OrientationHelper f9642ri;

    /* JADX INFO: renamed from: lr */
    private OrientationHelper m12296lr(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f9641lr;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f9641lr = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f9641lr;
    }

    /* JADX INFO: renamed from: ri */
    private int m12297ri(View view, OrientationHelper orientationHelper) {
        int decoratedStart = orientationHelper.getDecoratedStart(view);
        return decoratedStart >= orientationHelper.getStartAfterPadding() / 2 ? decoratedStart - orientationHelper.getStartAfterPadding() : decoratedStart;
    }

    /* JADX INFO: renamed from: ri */
    private OrientationHelper m12298ri(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f9642ri;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.f9642ri = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f9642ri;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        this.f9640ik = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = {0, 0};
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = m12297ri(view, m12296lr(layoutManager));
            return iArr;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = m12297ri(view, m12298ri(layoutManager));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.f9640ik.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ri.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected int calculateTimeForScrolling(int i) {
                    return Math.min(100, super.calculateTimeForScrolling(i));
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    C3074ri c3074ri = C3074ri.this;
                    int[] iArrCalculateDistanceToFinalSnap = c3074ri.calculateDistanceToFinalSnap(c3074ri.f9640ik.getLayoutManager(), view);
                    int i = iArrCalculateDistanceToFinalSnap[0];
                    int i2 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (iCalculateTimeForDeceleration > 0) {
                        action.update(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
            return null;
        }
        OrientationHelper orientationHelperM12298ri = m12298ri(layoutManager);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayoutManager.getChildAt(i2);
            int iAbs = Math.abs(orientationHelperM12298ri.getDecoratedStart(childAt));
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        View viewFindSnapView = findSnapView(layoutManager);
        int i3 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = layoutManager.getPosition(viewFindSnapView);
        if (layoutManager.canScrollVertically()) {
            i3 = i2 < 0 ? position - 1 : position + 1;
        }
        return Math.min(layoutManager.getItemCount() - 1, Math.max(i3, 0));
    }
}
