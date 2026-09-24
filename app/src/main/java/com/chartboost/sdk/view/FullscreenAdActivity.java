package com.chartboost.sdk.view;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.chartboost.sdk.impl.C3672bl;
import com.chartboost.sdk.impl.C3903m;
import com.chartboost.sdk.impl.C3948o;
import com.chartboost.sdk.impl.C4048sb;
import com.chartboost.sdk.impl.C4162xf;
import com.chartboost.sdk.impl.EnumC3820i8;
import com.chartboost.sdk.impl.EnumC3895le;
import com.chartboost.sdk.impl.InterfaceC3880l;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m43475d2 = {"Lcom/chartboost/sdk/view/FullscreenAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "onDestroy", "a", "", "Ljava/lang/String;", "auctionId", "Lcom/chartboost/sdk/impl/m;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/chartboost/sdk/impl/m;", "adContainerView", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "rootView", "", "d", "Z", "dismissable", "Landroidx/activity/OnBackPressedCallback;", "e", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "<init>", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
public final class FullscreenAdActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public String auctionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public C3903m adContainerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout rootView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean dismissable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final OnBackPressedCallback onBackPressedCallback = new C4234a();

    /* JADX INFO: renamed from: com.chartboost.sdk.view.FullscreenAdActivity$a */
    public static final class C4234a extends OnBackPressedCallback {
        public C4234a() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (!FullscreenAdActivity.this.dismissable) {
                C4048sb.m19408a("Back pressed but disallowed. Ignoring.", (Throwable) null, 2, (Object) null);
                return;
            }
            C3903m c3903m = FullscreenAdActivity.this.adContainerView;
            if (c3903m != null) {
                c3903m.m18556h();
            }
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.view.FullscreenAdActivity$b */
    public static final class C4235b implements InterfaceC3880l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC3880l f17290a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FullscreenAdActivity f17291b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3903m f17292c;

        /* JADX INFO: renamed from: com.chartboost.sdk.view.FullscreenAdActivity$b$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f17293a;

            static {
                int[] iArr = new int[EnumC3895le.values().length];
                try {
                    iArr[EnumC3895le.DISABLE_ORIENTATION_CHANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC3895le.ENABLE_ORIENTATION_CHANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC3895le.PORTRAIT_ONLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC3895le.LANDSCAPE_ONLY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f17293a = iArr;
            }
        }

        public C4235b(InterfaceC3880l interfaceC3880l, FullscreenAdActivity fullscreenAdActivity, C3903m c3903m) {
            this.f17290a = interfaceC3880l;
            this.f17291b = fullscreenAdActivity;
            this.f17292c = c3903m;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18166a() {
            Unit unit;
            InterfaceC3880l interfaceC3880l = this.f17290a;
            if (interfaceC3880l != null) {
                interfaceC3880l.mo18166a();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19417e("AdContainerListener null when onAdClicked()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18167a(EnumC3820i8 expirationReason) {
            Unit unit;
            Intrinsics.checkNotNullParameter(expirationReason, "expirationReason");
            InterfaceC3880l interfaceC3880l = this.f17290a;
            if (interfaceC3880l != null) {
                interfaceC3880l.mo18167a(expirationReason);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19417e("AdContainerListener null when onAdExpired()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18168a(EnumC3895le request) {
            int i;
            Intrinsics.checkNotNullParameter(request, "request");
            InterfaceC3880l interfaceC3880l = this.f17290a;
            if (interfaceC3880l != null) {
                interfaceC3880l.mo18168a(request);
            }
            int i2 = this.f17291b.getResources().getConfiguration().orientation;
            int i3 = -1;
            if (i2 != 1) {
                i = i2 != 2 ? -1 : 6;
            } else {
                i = 1;
            }
            FullscreenAdActivity fullscreenAdActivity = this.f17291b;
            int i4 = a.f17293a[request.ordinal()];
            if (i4 == 1) {
                i3 = i;
            } else if (i4 != 2) {
                if (i4 == 3) {
                    i3 = 1;
                } else {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 6;
                }
            }
            fullscreenAdActivity.setRequestedOrientation(i3);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: a */
        public void mo18169a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            ContextCompat.startActivity(this.f17291b, new Intent("android.intent.action.VIEW", Uri.parse(url)), null);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: b */
        public void mo18170b() {
            Unit unit;
            this.f17291b.finish();
            InterfaceC3880l interfaceC3880l = this.f17290a;
            if (interfaceC3880l != null) {
                interfaceC3880l.mo18170b();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19417e("AdContainerListener null when onAdClosed()", null, 2, null);
            }
            this.f17292c.m18568x65adad44(null);
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: c */
        public void mo18171c() {
            this.f17291b.dismissable = true;
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: d */
        public void mo18172d() {
            Unit unit;
            InterfaceC3880l interfaceC3880l = this.f17290a;
            if (interfaceC3880l != null) {
                interfaceC3880l.mo18172d();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19417e("AdContainerListener null when onAdRewarded()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.InterfaceC3880l
        /* JADX INFO: renamed from: e */
        public void mo18173e() {
            Unit unit;
            InterfaceC3880l interfaceC3880l = this.f17290a;
            if (interfaceC3880l != null) {
                interfaceC3880l.mo18173e();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19417e("AdContainerListener null when onAdShown()", null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final WindowInsetsCompat m20270a(FullscreenAdActivity this$0, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        C4048sb.m19408a("WindowInsets updated: " + insets, (Throwable) null, 2, (Object) null);
        C3903m c3903m = this$0.adContainerView;
        if (c3903m == null) {
            return insets;
        }
        c3903m.setRenderingContainerCalculator(new C4162xf(this$0));
        return insets;
    }

    /* JADX INFO: renamed from: a */
    public static final void m20272a(InterfaceC3880l interfaceC3880l) {
        if (interfaceC3880l != null) {
            interfaceC3880l.mo18173e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20275a() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new OnApplyWindowInsetsListener() { // from class: com.chartboost.sdk.view.FullscreenAdActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return FullscreenAdActivity.m20270a(this.f$0, view, windowInsetsCompat);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
        this.rootView = (FrameLayout) findViewById(R.id.content);
        String stringExtra = getIntent().getStringExtra("com.chartboost.sdk.internal.AdController.AdContainerMap");
        this.auctionId = stringExtra;
        C3903m c3903m = (C3903m) TypeIntrinsics.asMutableMap(C3948o.f15526n.m18830a()).remove(stringExtra);
        this.adContainerView = c3903m;
        if (c3903m == null) {
            C4048sb.m19417e("No loaded ad found. Finishing ad activity.", null, 2, null);
            finish();
            return;
        }
        final InterfaceC3880l interfaceC3880lM18555xbb2925d0 = c3903m.m18555xbb2925d0();
        c3903m.m18568x65adad44(new C4235b(interfaceC3880lM18555xbb2925d0, this, c3903m));
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        View viewM16988a = C3672bl.f13601r.m16988a(this, c3903m);
        if (viewM16988a == null) {
            viewM16988a = c3903m.getRootView();
        }
        View view = viewM16988a;
        Intrinsics.checkNotNull(view);
        C3672bl c3672bl = new C3672bl(this, c3903m, view, 1, 0, 100L, 25, false, 128, null);
        c3672bl.m16979a(new C3672bl.b() { // from class: com.chartboost.sdk.view.FullscreenAdActivity$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.C3672bl.b
            /* JADX INFO: renamed from: a */
            public final void mo16989a() {
                FullscreenAdActivity.m20272a(interfaceC3880lM18555xbb2925d0);
            }
        });
        c3672bl.m16987i();
        FrameLayout frameLayout2 = this.rootView;
        if (frameLayout2 != null) {
            frameLayout2.addView(c3903m);
        }
        c3903m.m18564p();
        getOnBackPressedDispatcher().addCallback(this.onBackPressedCallback);
        if (c3903m.m18558j()) {
            this.dismissable = true;
        }
        c3903m.m18560l();
        m20275a();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        C3903m c3903m = this.adContainerView;
        if (c3903m != null) {
            c3903m.m18557i();
        }
        C3903m c3903m2 = this.adContainerView;
        if (c3903m2 != null) {
            c3903m2.m18568x65adad44(null);
        }
        this.adContainerView = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
