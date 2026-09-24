package com.chartboost.sdk.impl;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.z6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\b\u0016B%\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bB9\b\u0011\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\b\u0010\fR\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\f¨\u0006!"}, m43475d2 = {"Lcom/chartboost/sdk/impl/z6;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/z6;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "banner", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "interstitial", "c", "rewarded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
@Serializable
public final /* data */ class C4197z6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String banner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String interstitial;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String rewarded;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.z6$a */
    public static final class a implements GeneratedSerializer {

        /* JADX INFO: renamed from: a */
        public static final a f17102a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f17103b;

        static {
            a aVar = new a();
            f17102a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.EndpointConfig", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("banner", true);
            pluginGeneratedSerialDescriptor.addElement("interstitial", true);
            pluginGeneratedSerialDescriptor.addElement("rewarded", true);
            f17103b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4197z6 deserialize(Decoder decoder) {
            String strDecodeStringElement;
            String strDecodeStringElement2;
            String str;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
                str = strDecodeStringElement3;
                i = 7;
            } else {
                strDecodeStringElement = null;
                String strDecodeStringElement4 = null;
                String strDecodeStringElement5 = null;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    if (iDecodeElementIndex == -1) {
                        z = false;
                    } else if (iDecodeElementIndex == 0) {
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                        i2 |= 1;
                    } else if (iDecodeElementIndex == 1) {
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                        i2 |= 2;
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
                        i2 |= 4;
                    }
                }
                strDecodeStringElement2 = strDecodeStringElement4;
                str = strDecodeStringElement5;
                i = i2;
            }
            String str2 = strDecodeStringElement;
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new C4197z6(i, str2, str, strDecodeStringElement2, null);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, C4197z6 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            C4197z6.m20106a(value, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return f17103b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.z6$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4197z6 m20112a() {
            return new C4197z6("https://da.chartboost.com/unified/v1/sdk/banner", "https://da.chartboost.com/unified/v1/sdk/interstitial", "https://da.chartboost.com/unified/v1/sdk/rewarded");
        }

        public final KSerializer<C4197z6> serializer() {
            return a.f17102a;
        }
    }

    public /* synthetic */ C4197z6(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.banner = "";
        } else {
            this.banner = str;
        }
        if ((i & 2) == 0) {
            this.interstitial = "";
        } else {
            this.interstitial = str2;
        }
        if ((i & 4) == 0) {
            this.rewarded = "";
        } else {
            this.rewarded = str3;
        }
    }

    public C4197z6(String banner, String interstitial, String rewarded) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        this.banner = banner;
        this.interstitial = interstitial;
        this.rewarded = rewarded;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m20106a(C4197z6 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.banner, "")) {
            output.encodeStringElement(serialDesc, 0, self.banner);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.interstitial, "")) {
            output.encodeStringElement(serialDesc, 1, self.interstitial);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && Intrinsics.areEqual(self.rewarded, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 2, self.rewarded);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInterstitial() {
        return this.interstitial;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRewarded() {
        return this.rewarded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4197z6)) {
            return false;
        }
        C4197z6 c4197z6 = (C4197z6) other;
        return Intrinsics.areEqual(this.banner, c4197z6.banner) && Intrinsics.areEqual(this.interstitial, c4197z6.interstitial) && Intrinsics.areEqual(this.rewarded, c4197z6.rewarded);
    }

    public int hashCode() {
        return (((this.banner.hashCode() * 31) + this.interstitial.hashCode()) * 31) + this.rewarded.hashCode();
    }

    public String toString() {
        return "EndpointConfig(banner=" + this.banner + ", interstitial=" + this.interstitial + ", rewarded=" + this.rewarded + ")";
    }
}
