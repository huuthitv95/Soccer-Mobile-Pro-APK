package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.W2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11726W2 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12308lg f26075a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11726W2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26075a = new a();
    }

    public final InterfaceC12308lg getViewBinder() {
        return this.f26075a;
    }

    /* JADX INFO: renamed from: com.ironsource.W2$a */
    public static final class a implements InterfaceC12308lg {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m27789b(C11707V0 adTools, long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.m33047e().m34220h().m27975a(true, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final void m27790c(final C11707V0 adTools, final long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.m33245d(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    C11726W2.a.m27791d(adTools, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final void m27791d(C11707V0 adTools, long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.m33047e().m34220h().m27966a(j);
        }

        @Override // com.ironsource.InterfaceC12308lg
        /* JADX INFO: renamed from: a */
        public void mo27792a(View view, FrameLayout.LayoutParams layoutParams, final C11707V0 adTools) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            final View childAt = C11726W2.this.getChildAt(0);
            final long jMo32179f = C11455Gb.f24351s.m25905d().mo25846h().mo32179f();
            if (jMo32179f <= 0) {
                C11726W2.this.removeView(childAt);
                C11726W2.this.addView(view, layoutParams);
                adTools.m33245d(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11726W2.a.m27787a(adTools, jMo32179f);
                    }
                });
                return;
            }
            adTools.m33245d(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C11726W2.a.m27789b(adTools, jMo32179f);
                }
            });
            view.setAlpha(0.0f);
            C11726W2.this.addView(view, layoutParams);
            if (childAt != null) {
                final C11726W2 c11726w2 = C11726W2.this;
                childAt.animate().alpha(0.0f).setDuration(jMo32179f).withStartAction(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11726W2.a.m27786a(childAt);
                    }
                }).withEndAction(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11726W2.a.m27788a(c11726w2, childAt, childAt);
                    }
                }).start();
            }
            view.animate().alpha(1.0f).setDuration(jMo32179f).withEndAction(new Runnable() { // from class: com.ironsource.W2$a$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    C11726W2.a.m27790c(adTools, jMo32179f);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m27787a(C11707V0 adTools, long j) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.m33047e().m34220h().m27975a(false, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m27786a(View this_apply) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m27788a(C11726W2 this$0, View view, View this_apply) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }
    }
}
