package com.facebook.ads.redexgen.core;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1J */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C43751J extends C47457M {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C43751J(C6902gi c6902gi) {
        super(c6902gi);
        setCarouselLayoutManager(c6902gi);
    }

    public AbstractC5253Ft getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C47457M
    public C6972hr getLayoutManager() {
        return (C6972hr) super.getLayoutManager();
    }

    public AbstractC5943R7 getOnScrollListener() {
        return new C5848PY(this);
    }

    private void setCarouselLayoutManager(C6902gi c6902gi) {
        C6972hr c6972hr = new C6972hr(c6902gi, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c6972hr.A1T(true);
        }
        super.setLayoutManager(c6972hr);
    }

    @Override // com.facebook.ads.redexgen.core.C47457M
    public void setLayoutManager(AbstractC5938R2 abstractC5938R2) {
    }
}
