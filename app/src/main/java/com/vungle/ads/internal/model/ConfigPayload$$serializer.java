package com.vungle.ads.internal.model;

import com.ironsource.C12305ld;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m43475d2 = {"com/vungle/ads/internal/model/ConfigPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class ConfigPayload$$serializer implements GeneratedSerializer<ConfigPayload> {
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("reuse_assets", true);
        pluginGeneratedSerialDescriptor.addElement("config", true);
        pluginGeneratedSerialDescriptor.addElement("endpoints", true);
        pluginGeneratedSerialDescriptor.addElement("log_metrics", true);
        pluginGeneratedSerialDescriptor.addElement(C12305ld.f30863c, true);
        pluginGeneratedSerialDescriptor.addElement("user", true);
        pluginGeneratedSerialDescriptor.addElement(Cookie.CONFIG_EXTENSION, true);
        pluginGeneratedSerialDescriptor.addElement(Cookie.COPPA_DISABLE_AD_ID, true);
        pluginGeneratedSerialDescriptor.addElement("ri_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("wait_for_connectivity_for_tpat", true);
        pluginGeneratedSerialDescriptor.addElement("sdk_session_timeout", true);
        pluginGeneratedSerialDescriptor.addElement("signals_disabled", true);
        pluginGeneratedSerialDescriptor.addElement("fpd_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("rta_debugging", true);
        pluginGeneratedSerialDescriptor.addElement("config_last_validated_ts", true);
        pluginGeneratedSerialDescriptor.addElement("auto_redirect", true);
        pluginGeneratedSerialDescriptor.addElement("enable_ot", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(ConfigPayload$CleverCache$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$ConfigSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$Endpoints$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(new ArrayListSerializer(Placement$$serializer.INSTANCE)), BuiltinSerializersKt.getNullable(ConfigPayload$UserPrivacy$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ConfigPayload$AutoRedirect$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ConfigPayload deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        int i;
        Object objDecodeNullableSerializableElement5;
        Object obj;
        Object obj2;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object obj3;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object objDecodeNullableSerializableElement13;
        Object objDecodeNullableSerializableElement14;
        Object objDecodeNullableSerializableElement15;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Object objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new ArrayListSerializer(Placement$$serializer.INSTANCE), null);
            Object objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, BooleanSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, BooleanSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, LongSerializer.INSTANCE, null);
            Object objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, null);
            i = 262143;
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, BooleanSerializer.INSTANCE, null);
            obj2 = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement21;
            obj3 = objDecodeNullableSerializableElement22;
            obj = objDecodeNullableSerializableElement16;
        } else {
            boolean z = true;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            Object objDecodeNullableSerializableElement28 = null;
            objDecodeNullableSerializableElement = null;
            objDecodeNullableSerializableElement2 = null;
            objDecodeNullableSerializableElement3 = null;
            Object objDecodeNullableSerializableElement29 = null;
            objDecodeNullableSerializableElement4 = null;
            Object objDecodeNullableSerializableElement30 = null;
            Object objDecodeNullableSerializableElement31 = null;
            Object objDecodeNullableSerializableElement32 = null;
            Object objDecodeNullableSerializableElement33 = null;
            Object objDecodeNullableSerializableElement34 = null;
            Object objDecodeNullableSerializableElement35 = null;
            i = 0;
            Object objDecodeNullableSerializableElement36 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement35 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, objDecodeNullableSerializableElement35);
                        i |= 1;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement23 = objDecodeNullableSerializableElement23;
                        break;
                    case 1:
                        i |= 2;
                        objDecodeNullableSerializableElement36 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement36);
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i |= 4;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i |= 8;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement29 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, new ArrayListSerializer(Placement$$serializer.INSTANCE), objDecodeNullableSerializableElement29);
                        i |= 16;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, objDecodeNullableSerializableElement4);
                        i |= 32;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement3);
                        i |= 64;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i |= 128;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i |= 256;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i |= 512;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 10:
                        objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 10, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        i |= 1024;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 11:
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 11, IntSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i |= 2048;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 12:
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        objDecodeNullableSerializableElement30 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 12, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement30);
                        i |= 4096;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement31 = objDecodeNullableSerializableElement31;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 13:
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        objDecodeNullableSerializableElement31 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 13, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement31);
                        i |= 8192;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement32 = objDecodeNullableSerializableElement32;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 14:
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        objDecodeNullableSerializableElement32 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 14, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement32);
                        i |= 16384;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement33 = objDecodeNullableSerializableElement33;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 15:
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        objDecodeNullableSerializableElement33 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 15, LongSerializer.INSTANCE, objDecodeNullableSerializableElement33);
                        i |= 32768;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement34 = objDecodeNullableSerializableElement34;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 16:
                        objDecodeNullableSerializableElement34 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, objDecodeNullableSerializableElement34);
                        i |= 65536;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    case 17:
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 17, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i |= 131072;
                        objDecodeNullableSerializableElement36 = objDecodeNullableSerializableElement36;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj4 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement26;
            Object obj5 = objDecodeNullableSerializableElement36;
            obj = objDecodeNullableSerializableElement35;
            obj2 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement25;
            objDecodeNullableSerializableElement7 = obj5;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement29;
            obj3 = objDecodeNullableSerializableElement34;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement33;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement32;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement31;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement30;
            objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement14 = objDecodeNullableSerializableElement28;
            objDecodeNullableSerializableElement15 = obj4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new ConfigPayload(i, (ConfigPayload.CleverCache) obj, (ConfigPayload.ConfigSettings) objDecodeNullableSerializableElement7, (ConfigPayload.Endpoints) objDecodeNullableSerializableElement6, (ConfigPayload.LogMetricsSettings) obj2, (List) objDecodeNullableSerializableElement8, (ConfigPayload.UserPrivacy) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement3, (Boolean) objDecodeNullableSerializableElement2, (Boolean) objDecodeNullableSerializableElement, (Integer) objDecodeNullableSerializableElement15, (Boolean) objDecodeNullableSerializableElement14, (Integer) objDecodeNullableSerializableElement13, (Boolean) objDecodeNullableSerializableElement12, (Boolean) objDecodeNullableSerializableElement11, (Boolean) objDecodeNullableSerializableElement10, (Long) objDecodeNullableSerializableElement9, (ConfigPayload.AutoRedirect) obj3, (Boolean) objDecodeNullableSerializableElement5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ConfigPayload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        ConfigPayload.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
