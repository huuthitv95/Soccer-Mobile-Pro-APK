package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12597x4 implements InterfaceC11340A4 {

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f32763a;

    /* JADX INFO: renamed from: b */
    private final SharedPreferences.Editor f32764b;

    public C12597x4(Context context, String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.f32763a = sharedPreferences;
        this.f32764b = sharedPreferences.edit();
    }

    @Override // com.ironsource.InterfaceC11340A4
    /* JADX INFO: renamed from: a */
    public String mo25263a(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.f32763a.getString(key, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC11340A4
    public Map<String, ?> allData() {
        Map<String, ?> all = this.f32763a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.InterfaceC11340A4
    /* JADX INFO: renamed from: b */
    public void mo25265b(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f32764b.putString(key, value).apply();
    }

    @Override // com.ironsource.InterfaceC11340A4
    /* JADX INFO: renamed from: a */
    public void mo25264a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f32764b.remove(key).apply();
    }
}
