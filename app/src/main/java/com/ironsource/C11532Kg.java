package com.ironsource;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.ironsource.Kg */
/* JADX INFO: loaded from: classes6.dex */
public final class C11532Kg implements InterfaceC12108b4 {

    /* JADX INFO: renamed from: c */
    static final /* synthetic */ KProperty<Object>[] f24873c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(C11532Kg.class, "activity", "getActivity()Landroid/app/Activity;", 0))};

    /* JADX INFO: renamed from: a */
    private Context f24874a;

    /* JADX INFO: renamed from: b */
    private final ReadWriteProperty f24875b;

    public C11532Kg(Activity activity, Context context) {
        this.f24874a = context;
        this.f24875b = C12111b7.m31145a(activity);
    }

    @Override // com.ironsource.InterfaceC12108b4
    /* JADX INFO: renamed from: a */
    public void mo26311a(Context context) {
        this.f24874a = context;
    }

    @Override // com.ironsource.InterfaceC12108b4
    /* JADX INFO: renamed from: b */
    public Context mo26312b() {
        return this.f24874a;
    }

    @Override // com.ironsource.InterfaceC12108b4
    /* JADX INFO: renamed from: a */
    public Activity mo26309a() {
        return (Activity) this.f24875b.getValue(this, f24873c[0]);
    }

    @Override // com.ironsource.InterfaceC12108b4
    /* JADX INFO: renamed from: a */
    public void mo26310a(Activity activity) {
        this.f24875b.setValue(this, f24873c[0], activity);
    }
}
