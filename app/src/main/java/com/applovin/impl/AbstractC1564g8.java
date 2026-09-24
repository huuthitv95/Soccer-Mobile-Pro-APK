package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.core.view.GravityCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.applovin.impl.g8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1564g8 {

    /* JADX INFO: renamed from: com.applovin.impl.g8$a */
    class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f1736a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f1737b;

        a(View view, Runnable runnable) {
            this.f1736a = view;
            this.f1737b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Runnable runnable = this.f1737b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f1736a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.g8$b */
    class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f1738a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f1739b;

        b(View view, Runnable runnable) {
            this.f1738a = view;
            this.f1739b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1738a.setVisibility(4);
            Runnable runnable = this.f1739b;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            this.f1738a.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WindowInsets m2750a(C1748l c1748l, View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(((Integer) c1748l.m4801a(C1831z4.f4069w2)).intValue());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsets.CONSUMED;
    }

    /* JADX INFO: renamed from: a */
    public static String m2751a(int i) {
        if (i == 0) {
            return "VISIBLE";
        }
        if (i == 4) {
            return "INVISIBLE";
        }
        return i == 8 ? "GONE" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: a */
    public static String m2752a(View view) {
        return view.getClass().getName() + '@' + Integer.toHexString(view.hashCode());
    }

    /* JADX INFO: renamed from: a */
    public static void m2753a(View view, long j, Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new a(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: renamed from: a */
    public static void m2754a(View view, final C1748l c1748l) {
        if (view == null || c1748l == null || !AbstractC1677p0.m3804b()) {
            return;
        }
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.applovin.impl.g8$$ExternalSyntheticLambda0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return AbstractC1564g8.m2750a(c1748l, view2, windowInsets);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2755a(int i, int i2) {
        return m2762b(i) != m2762b(i2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2756a(View view, Activity activity) {
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                return m2757a(view, window.getDecorView());
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            if (viewFindViewById != null) {
                return m2757a(view, viewFindViewById.getRootView());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m2757a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (m2757a(view, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX INFO: renamed from: a */
    public static int[] m2758a(int i, int i2, int i3) {
        if (i == 0) {
            return new int[]{i2, i3};
        }
        if ((i & Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) == 119) {
            return new int[]{13};
        }
        if ((i & 112) == 112) {
            i2 = 15;
        } else if ((i & 48) == 48) {
            i2 = 10;
        } else if ((i & 80) == 80) {
            i2 = 12;
        } else if ((i & 16) == 16) {
            i2 = 15;
        }
        if ((i & 7) == 7) {
            i3 = 14;
        } else if ((i & GravityCompat.START) == 8388611) {
            i3 = 20;
        } else if ((i & 3) == 3) {
            i3 = 9;
        } else if ((i & GravityCompat.END) == 8388613) {
            i3 = 21;
        } else if ((i & 5) == 5) {
            i3 = 11;
        } else if ((i & 1) == 1) {
            i3 = 14;
        }
        return new int[]{i3, i2};
    }

    /* JADX INFO: renamed from: b */
    public static Activity m2759b(View view, C1748l c1748l) {
        if (view == null) {
            return null;
        }
        for (int i = 0; i < 1000; i++) {
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5172a("ViewUtils", "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static View m2760b(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View viewFindViewById = rootView.findViewById(R.id.content);
        return viewFindViewById != null ? viewFindViewById : rootView;
    }

    /* JADX INFO: renamed from: b */
    public static void m2761b(View view, long j, Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new b(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2762b(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m2763c(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }
}
