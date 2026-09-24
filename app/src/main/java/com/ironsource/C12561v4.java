package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12561v4 implements InterfaceC11578N8, InterfaceC11560M8 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12564v7 f32588a;

    /* JADX WARN: Multi-variable type inference failed */
    public C12561v4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC11560M8
    /* JADX INFO: renamed from: a */
    public void mo26499a(Context context, EnumC12543u4 source, String key, String value) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC11340A4 interfaceC11340A4Mo33933a = this.f32588a.mo33933a(context, source);
        if (interfaceC11340A4Mo33933a != null) {
            interfaceC11340A4Mo33933a.mo25265b(key, value);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public C12561v4(InterfaceC12564v7 sharedSignalsStorageFactory) {
        Intrinsics.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.f32588a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.InterfaceC11578N8
    /* JADX INFO: renamed from: a */
    public String mo26663a(Context context, EnumC12543u4 source, String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC11340A4 interfaceC11340A4Mo33933a = this.f32588a.mo33933a(context, source);
        if (interfaceC11340A4Mo33933a != null) {
            return InterfaceC11340A4.CC.m25266a(interfaceC11340A4Mo33933a, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public /* synthetic */ C12561v4(InterfaceC12564v7 interfaceC12564v7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C12615y4() : interfaceC12564v7);
    }
}
