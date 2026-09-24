package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.response.InterfaceC9091i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8273g implements InterfaceC9091i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f18448a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EnumC8275i f18449b;

    public C8273g(List list, EnumC8275i enumC8275i) {
        this.f18448a = list;
        this.f18449b = enumC8275i;
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC9091i
    /* JADX INFO: renamed from: a */
    public final List mo20518a(EnumC8315x enumC8315x) {
        if (enumC8315x == null || this.f18448a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f18448a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f18449b.mReason)));
            }
        }
        return arrayList;
    }
}
