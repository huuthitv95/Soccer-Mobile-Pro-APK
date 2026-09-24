package com.unity3d.player;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.unity3d.player.h */
/* JADX INFO: loaded from: classes7.dex */
final class C14687h implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    Activity f41727b;

    /* JADX INFO: renamed from: a */
    WeakReference f41726a = new WeakReference(null);

    /* JADX INFO: renamed from: c */
    View f41728c = null;

    /* JADX INFO: renamed from: d */
    a f41729d = null;

    /* JADX INFO: renamed from: com.unity3d.player.h$a */
    class a extends View implements PixelCopy$OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a */
        Bitmap f41730a;

        a(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: a */
        public final void m43316a(SurfaceView surfaceView) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            this.f41730a = bitmapCreateBitmap;
            PixelCopy.request(surfaceView, bitmapCreateBitmap, this, new Handler(Looper.getMainLooper()));
        }

        public final void onPixelCopyFinished(int i) {
            if (i == 0) {
                setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(ViewCompat.MEASURED_STATE_MASK), new BitmapDrawable(getResources(), this.f41730a)}));
            }
        }
    }

    C14687h(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f41727b = activity;
            activity.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m43312a() {
        Activity activity = this.f41727b;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m43313a(SurfaceView surfaceView) {
        if (PlatformSupport.NOUGAT_SUPPORT) {
            if (this.f41728c == null) {
                this.f41729d = new a(this.f41727b);
            }
            this.f41729d.m43316a(surfaceView);
            this.f41728c = this.f41729d;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m43314a(ViewGroup viewGroup) {
        View view = this.f41728c;
        if (view == null || view.getParent() != null) {
            return;
        }
        viewGroup.addView(this.f41728c);
        viewGroup.bringChildToFront(this.f41728c);
    }

    /* JADX INFO: renamed from: b */
    public final void m43315b(ViewGroup viewGroup) {
        View view = this.f41728c;
        if (view == null || view.getParent() == null) {
            return;
        }
        viewGroup.removeView(this.f41728c);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f41726a = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
