package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Z7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11782Z7 extends Throwable {

    /* JADX INFO: renamed from: a */
    private final IronSourceError f26692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11782Z7(IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.f26692a = error;
    }

    /* JADX INFO: renamed from: a */
    public final IronSourceError m28065a() {
        return this.f26692a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(C11782Z7.class, obj.getClass())) {
            return false;
        }
        C11782Z7 c11782z7 = (C11782Z7) obj;
        if (this.f26692a.getErrorCode() != c11782z7.f26692a.getErrorCode()) {
            return false;
        }
        return Intrinsics.areEqual(this.f26692a.getErrorMessage(), c11782z7.f26692a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26692a.getErrorCode()), this.f26692a.getErrorMessage());
    }
}
