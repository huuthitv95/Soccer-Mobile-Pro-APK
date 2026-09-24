package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.Ce */
/* JADX INFO: loaded from: classes6.dex */
public final class C11386Ce {

    /* JADX INFO: renamed from: a */
    private final String f24179a;

    /* JADX INFO: renamed from: b */
    private final List<String> f24180b;

    /* JADX INFO: renamed from: c */
    private final boolean f24181c;

    public C11386Ce(String str, List<String> list, boolean z) {
        this.f24179a = str;
        this.f24180b = list;
        this.f24181c = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25583a() {
        if (this.f24181c) {
            List<String> list = this.f24180b;
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.f24179a;
                    if (str2 != null && StringsKt.startsWith$default(str2, str, false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        }
        List<String> list2 = this.f24180b;
        if (list2 != null && !list2.isEmpty()) {
            for (String str3 : list2) {
                String str4 = this.f24179a;
                if (str4 != null && StringsKt.contains$default((CharSequence) str4, (CharSequence) str3, false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final String m25584b() {
        return this.f24179a;
    }

    public /* synthetic */ C11386Ce(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z);
    }
}
