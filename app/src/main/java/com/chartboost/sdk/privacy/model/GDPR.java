package com.chartboost.sdk.privacy.model;

import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m43475d2 = {"Lcom/chartboost/sdk/privacy/model/GDPR;", "Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "", C11744X3.j.f26435b0, "", "c", "(Ljava/lang/String;)Z", "getConsent", "()Ljava/lang/String;", "Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;", "<init>", "(Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;)V", "Companion", "GDPR_CONSENT", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
public final class GDPR extends GenericDataUseConsent {
    public static final String GDPR_STANDARD = "gdpr";

    @Metadata(m43474d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m43475d2 = {"Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "NON_BEHAVIORAL", "BEHAVIORAL", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
    public enum GDPR_CONSENT {
        NON_BEHAVIORAL("0"),
        BEHAVIORAL("1");


        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String value;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f17278c = EnumEntriesKt.enumEntries(m20262a());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m43475d2 = {"Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT$Companion;", "", "()V", "fromValue", "Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;", "value", "", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0}, m43479xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final GDPR_CONSENT fromValue(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GDPR_CONSENT gdpr_consent = GDPR_CONSENT.NON_BEHAVIORAL;
                if (Intrinsics.areEqual(gdpr_consent.getValue(), value)) {
                    return gdpr_consent;
                }
                GDPR_CONSENT gdpr_consent2 = GDPR_CONSENT.BEHAVIORAL;
                if (Intrinsics.areEqual(gdpr_consent2.getValue(), value)) {
                    return gdpr_consent2;
                }
                return null;
            }
        }

        GDPR_CONSENT(String str) {
            this.value = str;
        }

        @JvmStatic
        public static final GDPR_CONSENT fromValue(String str) {
            return INSTANCE.fromValue(str);
        }

        public static EnumEntries<GDPR_CONSENT> getEntries() {
            return f17278c;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GDPR(GDPR_CONSENT consent) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(consent, "consent");
        if (m20261c(consent.getValue())) {
            m20266b(GDPR_STANDARD);
            m20264a((Object) consent.getValue());
        } else {
            m20265a("Invalid GDPR consent values. Use provided values or Custom class. Value: " + consent);
        }
    }

    /* JADX INFO: renamed from: c */
    private final boolean m20261c(String consent) {
        return Intrinsics.areEqual(GDPR_CONSENT.NON_BEHAVIORAL.getValue(), consent) || Intrinsics.areEqual(GDPR_CONSENT.BEHAVIORAL.getValue(), consent);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public String getConsent() {
        Object objM20263a = getConsentValue();
        Intrinsics.checkNotNull(objM20263a, "null cannot be cast to non-null type kotlin.String");
        return (String) objM20263a;
    }
}
