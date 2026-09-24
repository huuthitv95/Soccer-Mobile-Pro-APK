package com.ironsource;

import com.ironsource.AbstractC12259j3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Eg */
/* JADX INFO: loaded from: classes6.dex */
public final class C11424Eg<Smash extends AbstractC12259j3<?>> {

    /* JADX INFO: renamed from: a */
    private final AbstractC11514Jg<Smash> f24281a;

    public C11424Eg(AbstractC11514Jg<Smash> smashPicker) {
        Intrinsics.checkNotNullParameter(smashPicker, "smashPicker");
        this.f24281a = smashPicker;
    }

    /* JADX INFO: renamed from: a */
    public final List<Smash> m25738a() {
        return this.f24281a.m26240c();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25739b() {
        return this.f24281a.m26240c().isEmpty() && this.f24281a.m26239a().isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25740c() {
        return this.f24281a.m26241d() == 0;
    }
}
