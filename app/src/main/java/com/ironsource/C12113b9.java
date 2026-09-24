package com.ironsource;

import android.os.Debug;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.b9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12113b9 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12400o4 f30124a;

    /* JADX INFO: renamed from: b */
    private Long f30125b;

    /* JADX INFO: renamed from: c */
    private Long f30126c;

    /* JADX INFO: renamed from: d */
    private Integer f30127d;

    /* JADX INFO: renamed from: e */
    private Integer f30128e;

    /* JADX INFO: renamed from: f */
    private Integer f30129f;

    /* JADX INFO: renamed from: g */
    private C11801a9 f30130g;

    /* JADX WARN: Multi-variable type inference failed */
    public C12113b9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final C11801a9 m31184a() {
        return this.f30130g;
    }

    /* JADX INFO: renamed from: b */
    public final C11801a9 m31186b() {
        Long l = this.f30126c;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = this.f30125b;
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                Integer num = this.f30127d;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Integer num2 = this.f30128e;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        Integer num3 = this.f30129f;
                        if (num3 != null) {
                            int iIntValue3 = num3.intValue();
                            long jMo32926a = this.f30124a.mo32926a();
                            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                            Debug.getMemoryInfo(memoryInfo);
                            int i = memoryInfo.dalvikPss;
                            int i2 = memoryInfo.nativePss;
                            int totalPss = memoryInfo.getTotalPss();
                            long jMax = Math.max(0L, i - iIntValue);
                            long jMax2 = Math.max(0L, i2 - iIntValue2);
                            C11801a9 c11801a9 = new C11801a9(jMo32926a - jLongValue, new C11801a9.a(jMax, jMax2, Math.max(0L, (Math.max(0L, totalPss - iIntValue3) - jMax2) - jMax)), jLongValue2 / ((long) 1024));
                            this.f30130g = c11801a9;
                            return c11801a9;
                        }
                    }
                }
            }
        }
        return null;
    }

    public C12113b9(InterfaceC12400o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f30124a = currentTimeProvider;
    }

    /* JADX INFO: renamed from: a */
    public final void m31185a(String serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f30125b = Long.valueOf(serverResponse.length());
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        this.f30127d = Integer.valueOf(memoryInfo.dalvikPss);
        this.f30128e = Integer.valueOf(memoryInfo.nativePss);
        this.f30129f = Integer.valueOf(memoryInfo.getTotalPss());
        this.f30126c = Long.valueOf(this.f30124a.mo32926a());
    }

    public /* synthetic */ C12113b9(InterfaceC12400o4 interfaceC12400o4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC12400o4.a() : interfaceC12400o4);
    }
}
