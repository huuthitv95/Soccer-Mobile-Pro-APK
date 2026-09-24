package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.g4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12206g4 implements InterfaceC12528t7 {

    /* JADX INFO: renamed from: a */
    private final String f30421a;

    /* JADX INFO: renamed from: b */
    private final String f30422b;

    /* JADX INFO: renamed from: c */
    private final boolean f30423c;

    /* JADX INFO: renamed from: d */
    private final C11770Yc f30424d;

    public C12206g4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC12528t7
    /* JADX INFO: renamed from: a */
    public String mo31526a() {
        return this.f30421a;
    }

    @Override // com.ironsource.InterfaceC12528t7
    /* JADX INFO: renamed from: b */
    public boolean mo31527b() {
        return this.f30423c;
    }

    @Override // com.ironsource.InterfaceC12528t7
    /* JADX INFO: renamed from: c */
    public C11770Yc mo31528c() {
        return this.f30424d;
    }

    @Override // com.ironsource.InterfaceC12528t7
    /* JADX INFO: renamed from: d */
    public String mo31529d() {
        return this.f30422b;
    }

    public C12206g4(String controllerUrl, String cacheFolder, boolean z, C11770Yc rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.f30421a = controllerUrl;
        this.f30422b = cacheFolder;
        this.f30423c = z;
        this.f30424d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C12206g4(String str, String str2, boolean z, C11770Yc c11770Yc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new C11770Yc(str) : c11770Yc);
    }
}
