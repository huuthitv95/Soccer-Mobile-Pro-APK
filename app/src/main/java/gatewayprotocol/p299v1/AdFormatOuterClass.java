package gatewayprotocol.p299v1;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes7.dex */
public final class AdFormatOuterClass {

    public enum AdFormat implements Internal.EnumLite {
        AD_FORMAT_UNSPECIFIED(0),
        AD_FORMAT_INTERSTITIAL(1),
        AD_FORMAT_REWARDED(2),
        AD_FORMAT_BANNER(3),
        AD_FORMAT_MREC(4),
        AD_FORMAT_NATIVE(5),
        UNRECOGNIZED(-1);

        public static final int AD_FORMAT_BANNER_VALUE = 3;
        public static final int AD_FORMAT_INTERSTITIAL_VALUE = 1;
        public static final int AD_FORMAT_MREC_VALUE = 4;
        public static final int AD_FORMAT_NATIVE_VALUE = 5;
        public static final int AD_FORMAT_REWARDED_VALUE = 2;
        public static final int AD_FORMAT_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<AdFormat> internalValueMap = new Internal.EnumLiteMap<AdFormat>() { // from class: gatewayprotocol.v1.AdFormatOuterClass.AdFormat.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AdFormat findValueByNumber(int i) {
                return AdFormat.forNumber(i);
            }
        };
        private final int value;

        private static final class AdFormatVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new AdFormatVerifier();

            private AdFormatVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return AdFormat.forNumber(i) != null;
            }
        }

        AdFormat(int i) {
            this.value = i;
        }

        public static AdFormat forNumber(int i) {
            if (i == 0) {
                return AD_FORMAT_UNSPECIFIED;
            }
            if (i == 1) {
                return AD_FORMAT_INTERSTITIAL;
            }
            if (i == 2) {
                return AD_FORMAT_REWARDED;
            }
            if (i == 3) {
                return AD_FORMAT_BANNER;
            }
            if (i == 4) {
                return AD_FORMAT_MREC;
            }
            if (i != 5) {
                return null;
            }
            return AD_FORMAT_NATIVE;
        }

        public static Internal.EnumLiteMap<AdFormat> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return AdFormatVerifier.INSTANCE;
        }

        @Deprecated
        public static AdFormat valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    private AdFormatOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
