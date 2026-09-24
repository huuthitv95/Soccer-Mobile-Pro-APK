package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p300io.CloseableKt;

/* JADX INFO: renamed from: com.ironsource.R8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11647R8 implements InterfaceC11664S8 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11626Q3 f25570a;

    /* JADX WARN: Multi-variable type inference failed */
    public C11647R8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    private final Object m27338b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new Exception("file does not exists")));
        }
        Drawable drawableCreateFromPath = Drawable.createFromPath(file.getPath());
        if (drawableCreateFromPath == null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new Exception("failed to create a drawable")));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m44946constructorimpl(drawableCreateFromPath);
    }

    /* JADX INFO: renamed from: c */
    private final Object m27339c(String str) throws IOException {
        InputStream inputStreamMo25836a = this.f25570a.mo25836a(str);
        try {
            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamMo25836a, new File(str).getName());
            CloseableKt.closeFinally(inputStreamMo25836a, null);
            if (drawableCreateFromStream == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(new Exception("failed to create a drawable")));
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(drawableCreateFromStream);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStreamMo25836a, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final boolean m27340d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.InterfaceC11664S8
    /* JADX INFO: renamed from: a */
    public Object mo27341a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            return m27340d(url) ? m27339c(url) : m27338b(url);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(e));
        }
    }

    public C11647R8(InterfaceC11626Q3 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.f25570a = connectionFactory;
    }

    public /* synthetic */ C11647R8(InterfaceC11626Q3 interfaceC11626Q3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C11448G4.f24340a : interfaceC11626Q3);
    }
}
