package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.p4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8999p4 {
    /* JADX INFO: renamed from: a */
    public static Object m21699a(AbstractC9031w abstractC9031w, EnumC8963j4 enumC8963j4, EnumC8993o4 enumC8993o4) {
        switch (AbstractC8933e4.f21011a[enumC8963j4.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC9031w.mo21726f());
            case 2:
                return Float.valueOf(abstractC9031w.mo21731j());
            case 3:
                return Long.valueOf(abstractC9031w.mo21733l());
            case 4:
                return Long.valueOf(abstractC9031w.mo21743v());
            case 5:
                return Integer.valueOf(abstractC9031w.mo21732k());
            case 6:
                return Long.valueOf(abstractC9031w.mo21730i());
            case 7:
                return Integer.valueOf(abstractC9031w.mo21729h());
            case 8:
                return Boolean.valueOf(abstractC9031w.mo21723d());
            case 9:
                return abstractC9031w.mo21724e();
            case 10:
                return Integer.valueOf(abstractC9031w.mo21742u());
            case 11:
                return Integer.valueOf(abstractC9031w.mo21735n());
            case 12:
                return Long.valueOf(abstractC9031w.mo21736o());
            case 13:
                return Integer.valueOf(abstractC9031w.mo21737p());
            case 14:
                return Long.valueOf(abstractC9031w.mo21738q());
            case 15:
                return enumC8993o4.mo21666a(abstractC9031w);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
