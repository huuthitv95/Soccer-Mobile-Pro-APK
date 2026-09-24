package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzavc implements zzavx {
    public static final /* synthetic */ zzavc zza;
    public static final /* synthetic */ zzavc zzb;
    public static final /* synthetic */ zzavc zzc;
    public static final /* synthetic */ zzavc zzd;
    public static final /* synthetic */ zzavc zze;
    public static final /* synthetic */ zzavc zzf;
    public static final /* synthetic */ zzavc zzg;
    public static final /* synthetic */ zzavc zzh;
    public static final /* synthetic */ zzavc zzi;
    public static final /* synthetic */ zzavc zzj;
    public static final /* synthetic */ zzavc zzk;
    public static final /* synthetic */ zzavc zzl;
    public static final /* synthetic */ zzavc zzm;
    public static final /* synthetic */ zzavc zzn;
    public static final /* synthetic */ zzavc zzo;
    public static final /* synthetic */ zzavc zzp;
    public static final /* synthetic */ zzavc zzq;
    public static final /* synthetic */ zzavc zzr;
    public static final /* synthetic */ zzavc zzs;
    public static final /* synthetic */ zzavc zzt;
    public static final /* synthetic */ zzavc zzu;
    private final /* synthetic */ int zzv;

    static {
        int i = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i2 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i3 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i4 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i5 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i6 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i7 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        zzu = new zzavc((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        zzt = new zzavc((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        zzs = new zzavc((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        zzr = new zzavc(i7);
        zzq = new zzavc(i4);
        zzp = new zzavc(i5);
        zzavc zzavcVar = new zzavc(i6);
        int i8 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i9 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i10 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i11 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i12 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i13 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i14 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i15 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i16 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        zzo = zzavcVar;
        zzn = new zzavc(i3);
        zzm = new zzavc(i8);
        zzl = new zzavc(i9);
        zzk = new zzavc(i10);
        zzj = new zzavc(i2);
        zzi = new zzavc(i11);
        zzh = new zzavc(i12);
        zzg = new zzavc(i13);
        zzf = new zzavc(i);
        zze = new zzavc(i14);
        zzd = new zzavc(i15);
        zzc = new zzavc(i16);
        zzb = new zzavc(1);
        zza = new zzavc(0);
    }

    private /* synthetic */ zzavc(int i) {
        this.zzv = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x013f A[Catch: zzavv -> 0x009e, ClassNotFoundException -> 0x014f, zzawc -> 0x0157, zzavu -> 0x015f, TryCatch #15 {zzavv -> 0x009e, blocks: (B:256:0x070b, B:260:0x0727, B:262:0x072f, B:265:0x0739, B:267:0x0742, B:281:0x07b4, B:268:0x074b, B:269:0x0750, B:270:0x0751, B:273:0x0779, B:274:0x077e, B:278:0x0787, B:280:0x078f, B:284:0x07bc, B:285:0x07c1, B:286:0x07c2, B:6:0x003b, B:7:0x004b, B:9:0x0051, B:11:0x005f, B:13:0x0066, B:14:0x006d, B:16:0x0085, B:18:0x008c, B:28:0x00c5, B:33:0x00e4, B:67:0x0143, B:37:0x00ef, B:41:0x00fa, B:45:0x0105, B:49:0x0110, B:53:0x011b, B:57:0x0126, B:61:0x0131, B:65:0x013c, B:66:0x013f, B:74:0x016b, B:78:0x0182, B:86:0x01b1, B:95:0x01f3, B:103:0x022c, B:115:0x0270, B:117:0x0286, B:119:0x028d, B:125:0x02ae, B:127:0x02c6, B:129:0x02cd, B:150:0x03ff, B:180:0x04c1, B:182:0x04c9, B:186:0x04d5, B:187:0x04db, B:188:0x04df, B:189:0x04e6, B:205:0x0554, B:211:0x0587, B:217:0x05e3, B:223:0x0610, B:239:0x0673, B:245:0x06a9, B:251:0x06dc), top: B:292:0x000c }] */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        Object obj2;
        zzavw zzavwVar;
        zzawf zzawfVarZza;
        Class<?> cls;
        long j = 1;
        int i = 0;
        try {
            switch (this.zzv) {
                case 0:
                    try {
                        zzavw zzavwVar2 = ((zzawa) obj).zzb;
                        zzavwVar2.zzb(zzawf.zzb(zzavwVar2.zzc().zzm() + zzavwVar2.zzc().zzm()));
                        return Optional.empty();
                    } catch (zzavu unused) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused2) {
                        return Optional.of(zzaup.zzy);
                    }
                case 1:
                    try {
                        zzavw zzavwVar3 = ((zzawa) obj).zzb;
                        zzavwVar3.zzb(zzawf.zzc(zzavwVar3.zzc().zzq() + zzavwVar3.zzc().zzq()));
                        return Optional.empty();
                    } catch (zzavu unused3) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused4) {
                        return Optional.of(zzaup.zzy);
                    }
                case 2:
                    try {
                        zzavw zzavwVar4 = ((zzawa) obj).zzb;
                        zzavwVar4.zzb(zzawf.zzd(zzavwVar4.zzc().zzn().zzd(zzavwVar4.zzc().zzn())));
                        return Optional.empty();
                    } catch (zzavu unused5) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused6) {
                        return Optional.of(zzaup.zzy);
                    }
                case 3:
                    zzawa zzawaVar = (zzawa) obj;
                    try {
                        long jZze = zzawaVar.zzd.zze();
                        for (long j2 = 0; j2 < jZze; j2++) {
                            zzawaVar.zzb.zzb(zzawf.zza(null));
                        }
                        return Optional.empty();
                    } catch (zzavl | zzavn unused7) {
                        return Optional.of(zzaup.zzy);
                    } catch (zzavv unused8) {
                        return Optional.of(zzaup.zza);
                    }
                case 4:
                    try {
                        zzavw zzavwVar5 = ((zzawa) obj).zzb;
                        zzavwVar5.zzb(zzawf.zzb(zzavwVar5.zzc().zzm() & zzavwVar5.zzc().zzm()));
                        return Optional.empty();
                    } catch (zzavu unused9) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused10) {
                        return Optional.of(zzaup.zzy);
                    }
                case 5:
                    long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                    long j3 = jArr[0];
                    long j4 = jArr[1];
                    long j5 = jArr[2];
                    long j6 = jArr[3];
                    long j7 = jArr[4];
                    long j8 = jArr[5];
                    long j9 = jArr[6];
                    long j10 = jArr[7];
                    long j11 = j9 + (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8);
                    long j12 = j10 % 102194872;
                    try {
                        zzavw zzavwVar6 = ((zzawa) obj).zzb;
                        zzavwVar6.zzb(zzawf.zzb(zzavwVar6.zzc().zzm() ^ (j11 ^ j12)));
                        return Optional.empty();
                    } catch (zzavu unused11) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused12) {
                        return Optional.of(zzaup.zzy);
                    }
                case 6:
                    try {
                        zzavw zzavwVar7 = ((zzawa) obj).zzb;
                        zzavwVar7.zzb(zzawf.zzb(zzavwVar7.zzc().zzm() | zzavwVar7.zzc().zzm()));
                        return Optional.empty();
                    } catch (zzavu unused13) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused14) {
                        return Optional.of(zzaup.zzy);
                    }
                case 7:
                    try {
                        zzavw zzavwVar8 = ((zzawa) obj).zzb;
                        zzavwVar8.zzb(zzawf.zzb(zzavwVar8.zzc().zzm() ^ zzavwVar8.zzc().zzm()));
                        return Optional.empty();
                    } catch (zzavu unused15) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused16) {
                        return Optional.of(zzaup.zzy);
                    }
                case 8:
                    zzawa zzawaVar2 = (zzawa) obj;
                    try {
                        zzavw zzavwVar9 = zzawaVar2.zzb;
                        long jZzm = zzavwVar9.zzc().zzm();
                        zzavt zzavtVar = zzawaVar2.zzc;
                        zzavo zzavoVar = zzawaVar2.zzd;
                        zzavtVar.zza(zzavoVar.zzb(), 0L, zzavwVar9.zzb);
                        zzavoVar.zza(jZzm);
                        return Optional.empty();
                    } catch (zzavm | zzavn unused17) {
                        return Optional.of(zzaup.zzr);
                    } catch (zzavr unused18) {
                        return Optional.of(zzaup.zzB);
                    } catch (zzavu unused19) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused20) {
                        return Optional.of(zzaup.zzy);
                    }
                case 9:
                    zzawa zzawaVar3 = (zzawa) obj;
                    try {
                        zzavw zzavwVar10 = zzawaVar3.zzb;
                        long jZzm2 = zzavwVar10.zzc().zzm();
                        List listZzo = zzavwVar10.zzc().zzo();
                        int size = listZzo.size();
                        Object objZzh = zzavwVar10.zzc().zzh();
                        Object objZzl = zzavwVar10.zzc().zzl();
                        if (!(objZzl instanceof Method)) {
                            return Optional.of(zzaup.zzp);
                        }
                        Method method = (Method) objZzl;
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length != size) {
                            return Optional.of(zzaup.zzp);
                        }
                        Object[] objArr = new Object[size];
                        if (objZzh instanceof Constructor) {
                            Class<?>[] parameterTypes2 = ((Constructor) objZzh).getParameterTypes();
                            int length = parameterTypes2.length;
                            Object[] objArr2 = new Object[length];
                            List listZzo2 = ((zzawf) listZzo.get(0)).zzo();
                            if (listZzo2.size() != length) {
                                return Optional.of(zzaup.zzp);
                            }
                            for (int i2 = 0; i2 < listZzo2.size(); i2++) {
                                objArr2[i2] = ((zzawf) listZzo2.get(i2)).zzi(parameterTypes2[i2]);
                            }
                            obj2 = null;
                            objArr[0] = objArr2;
                        } else {
                            obj2 = null;
                            while (i < size) {
                                objArr[i] = ((zzawf) listZzo.get(i)).zzi(parameterTypes[i]);
                                i++;
                            }
                        }
                        try {
                            Object objInvoke = method.invoke(objZzh, objArr);
                            if (method.getReturnType() == Void.class || method.getReturnType() == Void.TYPE) {
                                zzavwVar = zzawaVar3.zzb;
                                zzawfVarZza = zzawf.zza(obj2);
                            } else if (jZzm2 != 0) {
                                zzavwVar = zzawaVar3.zzb;
                                zzawfVarZza = zzawf.zzg(objInvoke);
                            } else {
                                zzavwVar = zzawaVar3.zzb;
                                zzawfVarZza = zzawf.zza(objInvoke);
                            }
                            zzavwVar.zzb(zzawfVarZza);
                            return Optional.empty();
                        } catch (Throwable unused21) {
                            return Optional.of(zzaup.zzq);
                        }
                    } catch (zzavu unused22) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused23) {
                        return Optional.of(zzaup.zzp);
                    }
                case 10:
                    int i3 = ((((~2084546560) & 73475461) | 438076064) + ((2084546560 & 611428101) | 2023412224)) - (-1830321789);
                    int i4 = 1073781763 % 1003463633;
                    int i5 = ((((~461273879) & 107429921) | 378966045) + ((461273879 & 283197472) | 1937909388)) - 2133058944;
                    int i6 = 1917305981 % 575705360;
                    zzawa zzawaVar4 = (zzawa) obj;
                    try {
                        zzavw zzavwVar11 = zzawaVar4.zzb;
                        int iM22291m = zzes$$ExternalSyntheticBackport0.m22291m(zzavwVar11.zzc().zzm());
                        zzavj zzavjVarZzn = zzavwVar11.zzc().zzn();
                        zzavj zzavjVarZzn2 = zzavwVar11.zzc().zzn();
                        if (zzavjVarZzn.zza.length != (i3 ^ i4)) {
                            return Optional.of(zzaup.zzH);
                        }
                        int[] iArr = new int[i5 ^ i6];
                        ByteBuffer.wrap(zzavjVarZzn.zza()).asIntBuffer().get(iArr);
                        zzavb zzavbVar = new zzavb(iM22291m, iArr);
                        int i7 = ((((~1183912267) & 781500673) | 1683555012) + ((1183912267 & 180666625) | 541077750)) - (-1949988574);
                        int i8 = 1527793660 % 245277883;
                        int i9 = ((((~95266356) & 568641509) | 183483904) + ((95266356 & 553669093) | 504469010)) - 874379764;
                        int i10 = 2026478004 % 1659239833;
                        byte[] bArrZza = zzavjVarZzn2.zza();
                        int i11 = (((((~1787189168) & 1360184381) | 611517270) + ((1787189168 & 1426637867) | 612056018)) - 1771476931) ^ (1821115873 % 1010014811);
                        byte[] bArr = new byte[i11];
                        int i12 = 0;
                        while (i12 < bArrZza.length) {
                            if (i12 % i11 == 0) {
                                zzavbVar.zza(i12 >>> (i7 ^ i8), bArr);
                            } else if (i12 == 0) {
                                i12 = 0;
                                zzavbVar.zza(i12 >>> (i7 ^ i8), bArr);
                            }
                            int i13 = i9 ^ i10;
                            bArrZza[i12] = (byte) (((bArrZza[i12] ^ bArr[i12 % i11]) << i13) >> i13);
                            i12++;
                        }
                        zzawaVar4.zzb.zzb(zzawf.zzd(zzavj.zze(bArrZza)));
                        return Optional.empty();
                    } catch (zzavu unused24) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused25) {
                        return Optional.of(zzaup.zzy);
                    }
                case 11:
                    try {
                        zzavw zzavwVar12 = ((zzawa) obj).zzb;
                        double dZzq = zzavwVar12.zzc().zzq();
                        double dZzq2 = zzavwVar12.zzc().zzq();
                        if (dZzq == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            return Optional.of(zzaup.zzF);
                        }
                        zzavwVar12.zzb(zzawf.zzc(dZzq2 / dZzq));
                        return Optional.empty();
                    } catch (zzavu unused26) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused27) {
                        return Optional.of(zzaup.zzy);
                    }
                case 12:
                    try {
                        zzavw zzavwVar13 = ((zzawa) obj).zzb;
                        long jZzm3 = zzavwVar13.zzc().zzm();
                        long jZzm4 = zzavwVar13.zzc().zzm();
                        if (jZzm3 == 0) {
                            return Optional.of(zzaup.zzF);
                        }
                        zzavwVar13.zzb(zzawf.zzb(jZzm4 / jZzm3));
                        return Optional.empty();
                    } catch (zzavu unused28) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused29) {
                        return Optional.of(zzaup.zzy);
                    }
                case 13:
                    try {
                        ((zzawa) obj).zzb.zzc();
                        return Optional.empty();
                    } catch (zzavu unused30) {
                        return Optional.of(zzaup.zzA);
                    }
                case 14:
                    zzawa zzawaVar5 = (zzawa) obj;
                    try {
                        long jZzm5 = zzawaVar5.zzb.zzc().zzm();
                        try {
                            zzavw zzavwVar14 = zzawaVar5.zzb;
                            zzavwVar14.zzb(zzawf.zzj(zzavwVar14.zzd(jZzm5)));
                            return Optional.empty();
                        } catch (zzavu unused31) {
                            return Optional.of(zzaup.zzf);
                        }
                    } catch (zzavu unused32) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused33) {
                        return Optional.of(zzaup.zzy);
                    }
                case 15:
                    zzawa zzawaVar6 = (zzawa) obj;
                    try {
                        long jZzm6 = zzawaVar6.zzc.zzb().zzb + zzawaVar6.zzb.zzc().zzm();
                        try {
                            zzavw zzavwVar15 = zzawaVar6.zzb;
                            zzavwVar15.zzb(zzawf.zzj(zzavwVar15.zzd(-jZzm6)));
                            return Optional.empty();
                        } catch (zzavu unused34) {
                            return Optional.of(zzaup.zzf);
                        }
                    } catch (zzavs | zzavu unused35) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused36) {
                        return Optional.of(zzaup.zzy);
                    }
                case 16:
                    zzawa zzawaVar7 = (zzawa) obj;
                    try {
                        long jZze2 = zzawaVar7.zzc.zzb().zzb + zzawaVar7.zzd.zze();
                        try {
                            zzavw zzavwVar16 = zzawaVar7.zzb;
                            zzavwVar16.zzb(zzawf.zzj(zzavwVar16.zzd(-jZze2)));
                            return Optional.empty();
                        } catch (zzavu unused37) {
                            return Optional.of(zzaup.zzf);
                        }
                    } catch (zzavl | zzavn unused38) {
                        return Optional.of(zzaup.zzy);
                    } catch (zzavs unused39) {
                        return Optional.of(zzaup.zzx);
                    }
                case 17:
                    try {
                        zzavw zzavwVar17 = ((zzawa) obj).zzb;
                        if (new zzawb(true).compare(zzavwVar17.zzc(), zzavwVar17.zzc()) != 0) {
                            j = 0;
                        }
                        zzavwVar17.zzb(zzawf.zzb(j));
                        return Optional.empty();
                    } catch (zzavu unused40) {
                        return Optional.of(zzaup.zzx);
                    } catch (IllegalArgumentException unused41) {
                        return Optional.of(zzaup.zzd);
                    }
                case 18:
                    try {
                        zzavw zzavwVar18 = ((zzawa) obj).zzb;
                        String strZzc = zzavwVar18.zzc().zzn().zzc();
                        switch (strZzc) {
                            case "double":
                                cls = Double.TYPE;
                                break;
                            case "int":
                                cls = Integer.TYPE;
                                break;
                            case "byte":
                                cls = Byte.TYPE;
                                break;
                            case "char":
                                cls = Character.TYPE;
                                break;
                            case "long":
                                cls = Long.TYPE;
                                break;
                            case "void":
                                cls = Void.TYPE;
                                break;
                            case "boolean":
                                cls = Boolean.TYPE;
                                break;
                            case "float":
                                cls = Float.TYPE;
                                break;
                            case "short":
                                cls = Short.TYPE;
                                break;
                            default:
                                cls = Class.forName(strZzc);
                                break;
                        }
                        zzavwVar18.zzb(zzawf.zza(cls));
                        return Optional.empty();
                    } catch (zzavu unused42) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused43) {
                        return Optional.of(zzaup.zzl);
                    } catch (ClassNotFoundException unused44) {
                        return Optional.of(zzaup.zzm);
                    }
                case 19:
                    try {
                        zzavw zzavwVar19 = ((zzawa) obj).zzb;
                        List listZzo3 = zzavwVar19.zzc().zzo();
                        Class<?>[] clsArr = new Class[listZzo3.size()];
                        while (i < listZzo3.size()) {
                            Object objZzl2 = ((zzawf) listZzo3.get(i)).zzl();
                            if (!(objZzl2 instanceof Class)) {
                                return Optional.of(zzaup.zzn);
                            }
                            clsArr[i] = (Class) objZzl2;
                            i++;
                        }
                        String strZzc2 = zzavwVar19.zzc().zzn().zzc();
                        Object objZzl3 = zzavwVar19.zzc().zzl();
                        if (!(objZzl3 instanceof Class)) {
                            return Optional.of(zzaup.zzn);
                        }
                        zzavwVar19.zzb(zzawf.zza(((Class) objZzl3).getMethod(strZzc2, clsArr)));
                        return Optional.empty();
                    } catch (zzavu unused45) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused46) {
                        return Optional.of(zzaup.zzn);
                    } catch (NoSuchMethodException unused47) {
                        return Optional.of(zzaup.zzo);
                    } catch (SecurityException unused48) {
                        return Optional.of(zzaup.zzC);
                    }
                default:
                    int i14 = ((((~306851320) & 2040670728) | 1372152390) + ((306851320 & (-1473639347)) | (-2036492681))) - 244167092;
                    int i15 = 1764892438 % 764851988;
                    try {
                        zzavw zzavwVar20 = ((zzawa) obj).zzb;
                        long jZzm7 = zzavwVar20.zzc().zzm();
                        zzawf zzawfVarZzc = zzavwVar20.zzc();
                        zzawf zzawfVarZzc2 = zzavwVar20.zzc();
                        int i16 = zzawfVarZzc2.zza;
                        int i17 = (i14 ^ i15) + i16;
                        if (i16 == 0) {
                            throw null;
                        }
                        if (i17 == 3) {
                            zzavj zzavjVarZzn3 = zzawfVarZzc2.zzn();
                            int i18 = ((((~284327308) & 44384696) | 1708231444) + ((284327308 & 1647591593) | 1951966997)) - (-1088446899);
                            int i19 = 2085308422 % 531900034;
                            if (jZzm7 < 0) {
                                jZzm7 += (long) zzavjVarZzn3.zza.length;
                            }
                            if (zzawfVarZzc.zza != (i18 ^ i19)) {
                                throw new zzawc();
                            }
                            if (jZzm7 >= 0 && jZzm7 < zzavjVarZzn3.zza.length) {
                                char cCharAt = zzavjVarZzn3.zzc().charAt((int) jZzm7);
                                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length());
                                sb.append(cCharAt);
                                zzawfVarZzc = zzawf.zzd(zzavj.zzf(sb.toString()));
                            }
                        } else {
                            if (i17 != 4) {
                                throw new zzawc();
                            }
                            List listZzo4 = zzawfVarZzc2.zzo();
                            if (jZzm7 < 0) {
                                jZzm7 += (long) listZzo4.size();
                            }
                            if (jZzm7 >= 0 && jZzm7 < listZzo4.size()) {
                                zzawfVarZzc = (zzawf) listZzo4.get((int) jZzm7);
                            }
                        }
                        zzavwVar20.zzb(zzawfVarZzc);
                        return Optional.empty();
                    } catch (zzavu unused49) {
                        return Optional.of(zzaup.zzx);
                    } catch (zzawc unused50) {
                        return Optional.of(zzaup.zzy);
                    }
            }
        } catch (zzavv e) {
            throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
