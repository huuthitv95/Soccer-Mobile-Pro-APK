package com.chartboost.sdk.impl;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.s9 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002\b\u001cB[\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b9\u0010:Bo\b\u0011\u0012\u0006\u0010;\u001a\u00020\r\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\r\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b9\u0010>J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010\fR\"\u0010*\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010#\u0012\u0004\b)\u0010\u0019\u001a\u0004\b(\u0010\fR\"\u00100\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u0019\u001a\u0004\b-\u0010.R\"\u00104\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010#\u0012\u0004\b3\u0010\u0019\u001a\u0004\b2\u0010\fR\"\u00108\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010,\u0012\u0004\b7\u0010\u0019\u001a\u0004\b6\u0010.¨\u0006@"}, m43475d2 = {"Lcom/chartboost/sdk/impl/s9;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/chartboost/sdk/impl/s9;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/chartboost/sdk/impl/c2;", "Lcom/chartboost/sdk/impl/c2;", "getBanner", "()Lcom/chartboost/sdk/impl/c2;", "getBanner$annotations", "()V", "banner", "Lcom/chartboost/sdk/impl/sj;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/chartboost/sdk/impl/sj;", "getVideo", "()Lcom/chartboost/sdk/impl/sj;", "getVideo$annotations", "video", "c", "Ljava/lang/String;", "getDisplayManager", "getDisplayManager$annotations", "displayManager", "d", "getDisplayManagerVer", "getDisplayManagerVer$annotations", "displayManagerVer", "e", "Ljava/lang/Integer;", "getInstl", "()Ljava/lang/Integer;", "getInstl$annotations", "instl", InneractiveMediationDefs.GENDER_FEMALE, "getTagId", "getTagId$annotations", "tagId", "g", "getSecure", "getSecure$annotations", "secure", "<init>", "(Lcom/chartboost/sdk/impl/c2;Lcom/chartboost/sdk/impl/sj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/chartboost/sdk/impl/c2;Lcom/chartboost/sdk/impl/sj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
@Serializable
public final /* data */ class C4046s9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C3676c2 banner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C4056sj video;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String displayManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String displayManagerVer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Integer instl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String tagId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Integer secure;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.s9$a */
    public static final class a implements GeneratedSerializer {

        /* JADX INFO: renamed from: a */
        public static final a f16237a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f16238b;

        static {
            a aVar = new a();
            f16237a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.chartboost.sdk.internal.Model.openrtb26.Imp", aVar, 7);
            pluginGeneratedSerialDescriptor.addElement("banner", true);
            pluginGeneratedSerialDescriptor.addElement("video", true);
            pluginGeneratedSerialDescriptor.addElement("displaymanager", true);
            pluginGeneratedSerialDescriptor.addElement("displaymanagerver", true);
            pluginGeneratedSerialDescriptor.addElement("instl", true);
            pluginGeneratedSerialDescriptor.addElement("tagid", true);
            pluginGeneratedSerialDescriptor.addElement("secure", true);
            f16238b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4046s9 deserialize(Decoder decoder) {
            Integer num;
            String str;
            Integer num2;
            String str2;
            String str3;
            C4056sj c4056sj;
            C3676c2 c3676c2;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
            int i2 = 6;
            C3676c2 c3676c3 = null;
            if (compositeDecoderBeginStructure.decodeSequentially()) {
                C3676c2 c3676c4 = (C3676c2) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, C3676c2.a.f13653a, null);
                C4056sj c4056sj2 = (C4056sj) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, C4056sj.a.f16294a, null);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
                String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
                IntSerializer intSerializer = IntSerializer.INSTANCE;
                Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, intSerializer, null);
                String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
                Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, intSerializer, null);
                c3676c2 = c3676c4;
                num = num4;
                str = str6;
                str2 = str5;
                num2 = num3;
                str3 = str4;
                c4056sj = c4056sj2;
                i = 127;
            } else {
                boolean z = true;
                int i3 = 0;
                Integer num5 = null;
                C4056sj c4056sj3 = null;
                String str7 = null;
                String str8 = null;
                Integer num6 = null;
                String str9 = null;
                while (z) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 6;
                            break;
                        case 0:
                            c3676c3 = (C3676c2) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, C3676c2.a.f13653a, c3676c3);
                            i3 |= 1;
                            i2 = 6;
                            break;
                        case 1:
                            c4056sj3 = (C4056sj) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, C4056sj.a.f16294a, c4056sj3);
                            i3 |= 2;
                            i2 = 6;
                            break;
                        case 2:
                            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str7);
                            i3 |= 4;
                            break;
                        case 3:
                            str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str8);
                            i3 |= 8;
                            break;
                        case 4:
                            num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, num6);
                            i3 |= 16;
                            break;
                        case 5:
                            str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, str9);
                            i3 |= 32;
                            break;
                        case 6:
                            num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i2, IntSerializer.INSTANCE, num5);
                            i3 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                }
                num = num5;
                str = str9;
                num2 = num6;
                str2 = str8;
                str3 = str7;
                c4056sj = c4056sj3;
                c3676c2 = c3676c3;
                i = i3;
            }
            compositeDecoderBeginStructure.endStructure(descriptor);
            return new C4046s9(i, c3676c2, c4056sj, str3, str2, num2, str, num, null);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, C4046s9 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor descriptor = getDescriptor();
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
            C4046s9.m19396a(value, compositeEncoderBeginStructure, descriptor);
            compositeEncoderBeginStructure.endStructure(descriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            KSerializer nullable = BuiltinSerializersKt.getNullable(C3676c2.a.f13653a);
            KSerializer nullable2 = BuiltinSerializersKt.getNullable(C4056sj.a.f16294a);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
            KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return f16238b;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.s9$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<C4046s9> serializer() {
            return a.f16237a;
        }
    }

    public /* synthetic */ C4046s9(int i, C3676c2 c3676c2, C4056sj c4056sj, String str, String str2, Integer num, String str3, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.banner = null;
        } else {
            this.banner = c3676c2;
        }
        if ((i & 2) == 0) {
            this.video = null;
        } else {
            this.video = c4056sj;
        }
        if ((i & 4) == 0) {
            this.displayManager = null;
        } else {
            this.displayManager = str;
        }
        if ((i & 8) == 0) {
            this.displayManagerVer = null;
        } else {
            this.displayManagerVer = str2;
        }
        if ((i & 16) == 0) {
            this.instl = null;
        } else {
            this.instl = num;
        }
        if ((i & 32) == 0) {
            this.tagId = null;
        } else {
            this.tagId = str3;
        }
        if ((i & 64) == 0) {
            this.secure = null;
        } else {
            this.secure = num2;
        }
    }

    public C4046s9(C3676c2 c3676c2, C4056sj c4056sj, String str, String str2, Integer num, String str3, Integer num2) {
        this.banner = c3676c2;
        this.video = c4056sj;
        this.displayManager = str;
        this.displayManagerVer = str2;
        this.instl = num;
        this.tagId = str3;
        this.secure = num2;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m19396a(C4046s9 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.banner != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, C3676c2.a.f13653a, self.banner);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.video != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, C4056sj.a.f16294a, self.video);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.displayManager != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.displayManager);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.displayManagerVer != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.displayManagerVer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.instl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.instl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.tagId != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.tagId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.secure == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.secure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4046s9)) {
            return false;
        }
        C4046s9 c4046s9 = (C4046s9) other;
        return Intrinsics.areEqual(this.banner, c4046s9.banner) && Intrinsics.areEqual(this.video, c4046s9.video) && Intrinsics.areEqual(this.displayManager, c4046s9.displayManager) && Intrinsics.areEqual(this.displayManagerVer, c4046s9.displayManagerVer) && Intrinsics.areEqual(this.instl, c4046s9.instl) && Intrinsics.areEqual(this.tagId, c4046s9.tagId) && Intrinsics.areEqual(this.secure, c4046s9.secure);
    }

    public int hashCode() {
        C3676c2 c3676c2 = this.banner;
        int iHashCode = (c3676c2 == null ? 0 : c3676c2.hashCode()) * 31;
        C4056sj c4056sj = this.video;
        int iHashCode2 = (iHashCode + (c4056sj == null ? 0 : c4056sj.hashCode())) * 31;
        String str = this.displayManager;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayManagerVer;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.instl;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.tagId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.secure;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "Imp(banner=" + this.banner + ", video=" + this.video + ", displayManager=" + this.displayManager + ", displayManagerVer=" + this.displayManagerVer + ", instl=" + this.instl + ", tagId=" + this.tagId + ", secure=" + this.secure + ")";
    }
}
