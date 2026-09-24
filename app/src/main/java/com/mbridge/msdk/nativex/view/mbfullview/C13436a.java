package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.tools.C13195f;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.mbfullview.a */
/* JADX INFO: compiled from: FullViewManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13436a {

    /* JADX INFO: renamed from: b */
    private static volatile C13436a f37363b;

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f37364a;

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$a */
    /* JADX INFO: compiled from: FullViewManager.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ BaseView f37365a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f37366b;

        a(BaseView baseView, boolean z) {
            this.f37365a = baseView;
            this.f37366b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37365a.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
            this.f37365a.getmAnimationPlayer().getBackground().setAlpha(this.f37366b ? 200 : 255);
            C13436a.this.m38929a(this.f37365a.getmAnimationPlayer());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$b */
    /* JADX INFO: compiled from: FullViewManager.java */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f37368a;

        static {
            int[] iArr = new int[BaseView.EnumC13435a.values().length];
            f37368a = iArr;
            try {
                iArr[BaseView.EnumC13435a.FULL_TOP_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37368a[BaseView.EnumC13435a.FULL_MIDDLE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$c */
    /* JADX INFO: compiled from: FullViewManager.java */
    private class c implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        private WeakReference<MBridgeTopFullView> f37369a;

        public c(MBridgeTopFullView mBridgeTopFullView) {
            this.f37369a = new WeakReference<>(mBridgeTopFullView);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            WeakReference<MBridgeTopFullView> weakReference = this.f37369a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f37369a.get().getMBridgeFullViewDisplayIcon().setImageBitmap(C13436a.this.m38926a(bitmap, 25));
        }
    }

    private C13436a(Context context) {
        this.f37364a = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: b */
    public void m38938b(boolean z, boolean z2, BaseView baseView) {
        if (z2) {
            new Handler().postDelayed(new a(baseView, z), 1000L);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C13436a m38928a(Context context) {
        if (f37363b == null) {
            synchronized (C13436a.class) {
                if (f37363b == null) {
                    f37363b = new C13436a(context);
                }
            }
        }
        return f37363b;
    }

    /* JADX INFO: renamed from: a */
    public void m38932a(BaseView.EnumC13435a enumC13435a, CampaignEx campaignEx, BaseView baseView) {
        int i = b.f37368a[enumC13435a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            baseView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
            return;
        }
        MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
        if (mBridgeTopFullView != null) {
            Context context = this.f37364a.get();
            if (context != null) {
                C13100b.m37152a(context).m37155a(campaignEx.getIconUrl(), new c(mBridgeTopFullView));
            }
            mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setText(campaignEx.getAppName());
            mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setText(campaignEx.getAppDesc());
            mBridgeTopFullView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
            mBridgeTopFullView.getStarLevelLayoutView().setRating((int) campaignEx.getRating());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38935a(boolean z, BaseView baseView) {
        if (baseView instanceof MBridgeTopFullView) {
            MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
            int i = z ? 0 : 8;
            mBridgeTopFullView.getMBridgeFullViewDisplayIcon().setVisibility(i);
            mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setVisibility(i);
            mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setVisibility(i);
            mBridgeTopFullView.getStarLevelLayoutView().setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38936a(boolean z, BaseView baseView, int i) {
        RelativeLayout.LayoutParams layoutParams;
        Context context = this.f37364a.get();
        if (context != null) {
            if (z) {
                layoutParams = new RelativeLayout.LayoutParams((int) (m38925a(z) / 3.0f), C13229v0.m37876a(context, 45.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = C13229v0.m37876a(context, 10.0f);
                layoutParams.rightMargin = (C13195f.m37673a(context) && i == 0) ? C13229v0.m37911c(context) + C13229v0.m37876a(context, 8.0f) : C13229v0.m37876a(context, 8.0f);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, C13229v0.m37876a(context, 45.0f));
                layoutParams.addRule(12);
            }
            baseView.getmAnimationContent().setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: a */
    private float m38925a(boolean z) {
        try {
            Context context = this.f37364a.get();
            if (context == null) {
                return 0.0f;
            }
            float fM37936i = C13229v0.m37936i(context);
            return z ? fM37936i + C13229v0.m37911c(context) : fM37936i;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38937a(boolean z, boolean z2, BaseView baseView) {
        int color = Color.parseColor("#ff264870");
        baseView.getmAnimationPlayer().setBackgroundColor(color);
        Context context = this.f37364a.get();
        if (!z) {
            if (baseView.style == BaseView.EnumC13435a.FULL_MIDDLE_VIEW) {
                m38938b(z, z2, baseView);
                return;
            } else {
                if (context != null) {
                    baseView.getmAnimationContent().setBackgroundResource(C13203i0.m37707a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                    baseView.getmAnimationPlayer().setBackgroundResource(C13203i0.m37707a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                    return;
                }
                return;
            }
        }
        if (baseView.style == BaseView.EnumC13435a.FULL_TOP_VIEW && context != null) {
            baseView.getmAnimationContent().setBackgroundResource(C13203i0.m37707a(context, "mbridge_nativex_fullview_background", "drawable"));
            baseView.getmAnimationPlayer().setBackgroundColor(color);
        }
        if (z2) {
            baseView.getmAnimationPlayer().getBackground().setAlpha(80);
        } else {
            baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
            baseView.getmAnimationPlayer().getBackground().setAlpha(200);
        }
        m38938b(z, z2, baseView);
    }

    /* JADX INFO: renamed from: a */
    public void m38933a(BaseView baseView) {
        baseView.getmAnimationPlayer().clearAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38929a(View view) {
        if (view == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setRepeatCount(2);
        alphaAnimation.setRepeatMode(1);
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public Bitmap m38926a(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        bitmap.getWidth();
        float f = i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: a */
    public void m38931a(View view, BaseView baseView) {
        if (view == null || baseView == null) {
            return;
        }
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        baseView.f37355i.addView(view);
    }

    /* JADX INFO: renamed from: a */
    public void m38934a(BaseView baseView, boolean z) {
        if (baseView != null) {
            baseView.setSystemUiVisibility(z ? 0 : InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
    }
}
