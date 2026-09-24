package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.Q7 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC11630Q7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* JADX INFO: renamed from: b */
    public static final a f25555b = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f25560a;

    /* JADX INFO: renamed from: com.ironsource.Q7$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC11630Q7 m27294a(Integer num) {
            for (EnumC11630Q7 enumC11630Q7 : EnumC11630Q7.values()) {
                int iM27293b = enumC11630Q7.m27293b();
                if (num != null && iM27293b == num.intValue()) {
                    if (enumC11630Q7 == null) {
                        return EnumC11630Q7.UnknownProvider;
                    }
                    return enumC11630Q7;
                }
            }
            enumC11630Q7 = null;
            if (enumC11630Q7 == null) {
                return EnumC11630Q7.UnknownProvider;
            }
            return enumC11630Q7;
        }

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public final EnumC11630Q7 m27295a(String dynamicDemandSourceId) {
            Intrinsics.checkNotNullParameter(dynamicDemandSourceId, "dynamicDemandSourceId");
            List listSplit$default = StringsKt.split$default((CharSequence) dynamicDemandSourceId, new String[]{"_"}, false, 0, 6, (Object) null);
            return listSplit$default.size() < 2 ? EnumC11630Q7.UnknownProvider : m27294a(StringsKt.toIntOrNull((String) listSplit$default.get(1)));
        }
    }

    EnumC11630Q7(int i) {
        this.f25560a = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m27293b() {
        return this.f25560a;
    }
}
