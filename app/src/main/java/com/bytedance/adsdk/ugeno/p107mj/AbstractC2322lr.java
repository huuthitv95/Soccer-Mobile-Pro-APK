package com.bytedance.adsdk.ugeno.p107mj;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.lr */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2322lr {

    /* JADX INFO: renamed from: lr */
    private DataSetObserver f6001lr;

    /* JADX INFO: renamed from: ri */
    private final DataSetObservable f6002ri = new DataSetObservable();

    /* JADX INFO: renamed from: ik */
    public void m7939ik() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f6001lr;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f6002ri.notifyChanged();
    }

    /* JADX INFO: renamed from: lr */
    public Parcelable m7940lr() {
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public float mo7522ri(int i) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: ri */
    public abstract int mo7523ri();

    /* JADX INFO: renamed from: ri */
    public int mo7524ri(Object obj) {
        return -1;
    }

    @Deprecated
    /* JADX INFO: renamed from: ri */
    public Object m7941ri(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* JADX INFO: renamed from: ri */
    public Object mo7525ri(ViewGroup viewGroup, int i) {
        return m7941ri((View) viewGroup, i);
    }

    /* JADX INFO: renamed from: ri */
    void m7942ri(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f6001lr = dataSetObserver;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ri */
    public void m7943ri(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* JADX INFO: renamed from: ri */
    public void mo7526ri(ViewGroup viewGroup, int i, Object obj) {
        m7943ri((View) viewGroup, i, obj);
    }

    /* JADX INFO: renamed from: ri */
    public abstract boolean mo7527ri(View view, Object obj);
}
