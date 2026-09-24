package com.ironsource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.G4 */
/* JADX INFO: loaded from: classes6.dex */
final class C11448G4 implements InterfaceC11626Q3 {

    /* JADX INFO: renamed from: a */
    public static final C11448G4 f24340a = new C11448G4();

    private C11448G4() {
    }

    @Override // com.ironsource.InterfaceC11626Q3
    /* JADX INFO: renamed from: a */
    public InputStream mo25836a(String url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        InputStream inputStreamOpenStream = new URL(url).openStream();
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }
}
