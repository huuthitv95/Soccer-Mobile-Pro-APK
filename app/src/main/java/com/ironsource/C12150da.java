package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.da */
/* JADX INFO: loaded from: classes6.dex */
public final class C12150da extends WebView implements InterfaceC12424pa {

    /* JADX INFO: renamed from: a */
    private InterfaceC12406oa f30243a;

    /* JADX INFO: renamed from: b */
    private InterfaceC11546Lc f30244b;

    public /* synthetic */ C12150da(Context context, InterfaceC12406oa interfaceC12406oa, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new InterfaceC12406oa.a(0, 1, null) : interfaceC12406oa);
    }

    @Override // com.ironsource.InterfaceC12424pa
    /* JADX INFO: renamed from: a */
    public void mo31307a(String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        InterfaceC12406oa interfaceC12406oa = this.f30243a;
        InterfaceC12406oa interfaceC12406oa2 = null;
        if (interfaceC12406oa == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            interfaceC12406oa = null;
        }
        if (!interfaceC12406oa.mo32966a()) {
            InterfaceC12406oa interfaceC12406oa3 = this.f30243a;
            if (interfaceC12406oa3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
                interfaceC12406oa3 = null;
            }
            interfaceC12406oa3.mo32964a(this);
        }
        InterfaceC12406oa interfaceC12406oa4 = this.f30243a;
        if (interfaceC12406oa4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
        } else {
            interfaceC12406oa2 = interfaceC12406oa4;
        }
        interfaceC12406oa2.mo32965a(script);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent event) {
        InterfaceC11546Lc interfaceC11546Lc;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i == 4 && (interfaceC11546Lc = this.f30244b) != null && interfaceC11546Lc.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i, event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12150da(Context context, InterfaceC12406oa javascriptEngine) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.f30243a = javascriptEngine;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12150da(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final void m31306a(InterfaceC11546Lc interfaceC11546Lc) {
        this.f30244b = interfaceC11546Lc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12150da(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX INFO: renamed from: a */
    public final void m31305a() {
        this.f30244b = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12150da(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
