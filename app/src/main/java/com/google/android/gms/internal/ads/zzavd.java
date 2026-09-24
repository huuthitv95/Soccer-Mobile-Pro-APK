package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzavd implements zzavx {
    public static final /* synthetic */ zzavd zza;
    public static final /* synthetic */ zzavd zzb;
    public static final /* synthetic */ zzavd zzc;
    public static final /* synthetic */ zzavd zzd;
    public static final /* synthetic */ zzavd zze;
    public static final /* synthetic */ zzavd zzf;
    public static final /* synthetic */ zzavd zzg;
    public static final /* synthetic */ zzavd zzh;
    public static final /* synthetic */ zzavd zzi;
    public static final /* synthetic */ zzavd zzj;
    public static final /* synthetic */ zzavd zzk;
    public static final /* synthetic */ zzavd zzl;
    public static final /* synthetic */ zzavd zzm;
    public static final /* synthetic */ zzavd zzn;
    public static final /* synthetic */ zzavd zzo;
    public static final /* synthetic */ zzavd zzp;
    public static final /* synthetic */ zzavd zzq;
    public static final /* synthetic */ zzavd zzr;
    public static final /* synthetic */ zzavd zzs;
    public static final /* synthetic */ zzavd zzt;
    public static final /* synthetic */ zzavd zzu;
    private final /* synthetic */ int zzv;

    static {
        int i = (((((~574682290) & 203332142) | 828655825) + ((574682290 & 488280686) | 1367367889)) - 2039730118) ^ (1891066487 % 382926234);
        int i2 = (((((~138700754) & 1311190796) | 1098494210) + ((138700754 & 235277837) | 2126145)) - 1303500118) ^ (631340353 % 54449299);
        int i3 = (((((~429857344) & 761470753) | 244716435) + ((429857344 & 862030880) | 1585885407)) - (-1912977126)) ^ (1209597698 % 1200977805);
        int i4 = (((((~353056618) & 587352576) | 1209239528) + ((353056618 & 1728108930) | 1420269559)) - (-1847305937)) ^ (1896236448 % 1127167744);
        int i5 = (((((~899633766) & 123837830) | 368257288) + ((899633766 & 167810182) | 1023429240)) - 1335244442) ^ (2104001379 % 2013966848);
        int i6 = (((((~1451163042) & 1144033732) | 979119168) + ((1451163042 & 1142985108) | 17523737)) - 1635219142) ^ (1178835412 % 674426555);
        int i7 = (((((~2129768394) & 1627076842) | 1930240353) + ((2129768394 & 384997514) | 369722160)) - (-1995771891)) ^ (1450967523 % 42186306);
        zzu = new zzavd((((((~880944650) & 1717883648) | 10231720) + ((880944650 & 1718140932) | 277359766)) - 1470954277) ^ (2122533302 % 1588279465));
        zzt = new zzavd((((((~2105342203) & 63587109) | 1700430907) + ((2105342203 & 42025732) | 358031402)) - 2053339984) ^ (1059789835 % 1012707329));
        zzs = new zzavd((((((~217704412) & 144255288) | 1174857666) + ((217704412 & 1788447288) | 1667270208)) - (-1441824169)) ^ (1234644696 % 220282619));
        zzr = new zzavd(i7);
        zzq = new zzavd(i4);
        zzp = new zzavd(i5);
        zzavd zzavdVar = new zzavd(i6);
        int i8 = (((((~363159161) & 562794784) | 672605403) + ((363159161 & 25727904) | 2081572569)) - (-1616076716)) ^ (912078408 % 135177290);
        int i9 = (((((~1362243428) & 18451060) | 1179867339) + ((1362243428 & 558662325) | 550966467)) - 1623872455) ^ (1106211926 % 327305250);
        int i10 = (((((~1725362297) & 1360741300) | 1109702041) + ((1725362297 & 354116135) | 1147188355)) - (-1834394863)) ^ (1760481135 % 279527351);
        int i11 = (((((~167368542) & 67146177) | 1656237739) + ((167368542 & 1145098568) | 1113671327)) - (-1733089599)) ^ (1999038585 % 574620392);
        int i12 = (((((~1855103807) & 659964675) | 1290440236) + ((1855103807 & 588562691) | 482511980)) - 1987315200) ^ (988506952 % 614340012);
        int i13 = (((((~309667127) & 3230344) | 101519449) + ((309667127 & 607439488) | 793023522)) - 846909944) ^ (1953534826 % 1902736997);
        int i14 = (((((~682736626) & 1985796848) | 208315317) + ((682736626 & 1922324801) | 8464129)) - 2089727599) ^ (649022765 % 608034986);
        int i15 = (((((~2068224547) & 575179716) | 1587938398) + ((2068224547 & 1013484418) | 1605526586)) - (-1152499266)) ^ (1603386966 % 1010764797);
        int i16 = (((((~1281944976) & 1463473736) | 847256033) + ((1281944976 & 1698424328) | 948255187)) - (-1974214194)) ^ (1727952741 % 1091714937);
        zzo = zzavdVar;
        zzn = new zzavd(i3);
        zzm = new zzavd(i8);
        zzl = new zzavd(i9);
        zzk = new zzavd(i10);
        zzj = new zzavd(i2);
        zzi = new zzavd(i11);
        zzh = new zzavd(i12);
        zzg = new zzavd(i13);
        zzf = new zzavd(i);
        zze = new zzavd(i14);
        zzd = new zzavd(i15);
        zzc = new zzavd(i16);
        zzb = new zzavd(1);
        zza = new zzavd(0);
    }

    private /* synthetic */ zzavd(int i) {
        this.zzv = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        long j = 1;
        try {
            try {
                switch (this.zzv) {
                    case 0:
                        zzawa zzawaVar = (zzawa) obj;
                        try {
                            zzavw zzavwVar = zzawaVar.zzb;
                            long jZzm = zzavwVar.zzc().zzm();
                            if (zzavwVar.zzc().zzm() != 0) {
                                zzawaVar.zzd.zza(jZzm);
                                break;
                            }
                            return Optional.empty();
                        } catch (zzavm | zzavn unused) {
                            return Optional.of(zzaup.zzi);
                        } catch (zzavu unused2) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused3) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 1:
                        try {
                            zzavw zzavwVar2 = ((zzawa) obj).zzb;
                            long jZzm2 = zzavwVar2.zzc().zzm();
                            zzawf zzawfVarZzc = zzavwVar2.zzc();
                            zzawf zzawfVarZzc2 = zzavwVar2.zzc();
                            List listZzo = zzawfVarZzc2.zzo();
                            if (jZzm2 < 0) {
                                jZzm2 += (long) (listZzo.size() + 1);
                            }
                            if (jZzm2 < 0 || jZzm2 >= listZzo.size() + 1) {
                                throw new zzawd();
                            }
                            listZzo.add((int) jZzm2, zzawfVarZzc);
                            zzavwVar2.zzb(zzawfVarZzc2);
                            return Optional.empty();
                        } catch (zzavu unused4) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused5) {
                            return Optional.of(zzaup.zzy);
                        } catch (zzawd unused6) {
                            return Optional.of(zzaup.zzI);
                        }
                    case 2:
                        zzawa zzawaVar2 = (zzawa) obj;
                        try {
                            zzavw zzavwVar3 = zzawaVar2.zzb;
                            long jZzm3 = zzavwVar3.zzc().zzm();
                            if (zzavwVar3.zzc().zzm() == 0) {
                                zzawaVar2.zzd.zza(jZzm3);
                                break;
                            }
                            return Optional.empty();
                        } catch (zzavm | zzavn unused7) {
                            return Optional.of(zzaup.zzi);
                        } catch (zzavu unused8) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused9) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 3:
                        try {
                            zzavw zzavwVar4 = ((zzawa) obj).zzb;
                            zzavwVar4.zzb(zzawf.zzb(zzavwVar4.zzc().zzo().size()));
                            return Optional.empty();
                        } catch (zzavu unused10) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused11) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 4:
                        try {
                            zzavw zzavwVar5 = ((zzawa) obj).zzb;
                            zzavwVar5.zzb(zzawf.zzb(zzavwVar5.zzc().zzn().zza.length));
                            return Optional.empty();
                        } catch (zzavu unused12) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused13) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 5:
                        try {
                            zzavw zzavwVar6 = ((zzawa) obj).zzb;
                            zzavwVar6.zzb(zzawf.zzc(Math.log(zzavwVar6.zzc().zzq())));
                            return Optional.empty();
                        } catch (zzavu unused14) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused15) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 6:
                        try {
                            zzavw zzavwVar7 = ((zzawa) obj).zzb;
                            long jZzm4 = zzavwVar7.zzc().zzm();
                            long jZzm5 = zzavwVar7.zzc().zzm();
                            if (jZzm4 == 0 || jZzm5 == 0) {
                                j = 0;
                            }
                            zzavwVar7.zzb(zzawf.zzb(j));
                            return Optional.empty();
                        } catch (zzavu unused16) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused17) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 7:
                        try {
                            zzavw zzavwVar8 = ((zzawa) obj).zzb;
                            if (zzavwVar8.zzc().zzm() != 0) {
                                j = 0;
                            }
                            zzavwVar8.zzb(zzawf.zzb(j));
                            return Optional.empty();
                        } catch (zzavu unused18) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused19) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 8:
                        try {
                            zzavw zzavwVar9 = ((zzawa) obj).zzb;
                            long jZzm6 = zzavwVar9.zzc().zzm();
                            long jZzm7 = zzavwVar9.zzc().zzm();
                            if (jZzm6 == 0 && jZzm7 == 0) {
                                j = 0;
                            }
                            zzavwVar9.zzb(zzawf.zzb(j));
                            return Optional.empty();
                        } catch (zzavu unused20) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused21) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 9:
                        zzawa zzawaVar3 = (zzawa) obj;
                        try {
                            zzavw zzavwVar10 = zzawaVar3.zzb;
                            try {
                                int iCompare = new zzawb(false).compare(zzavwVar10.zzc(), zzavwVar10.zzc());
                                zzavw zzavwVar11 = zzawaVar3.zzb;
                                if (iCompare >= 0) {
                                    j = 0;
                                }
                                zzavwVar11.zzb(zzawf.zzb(j));
                                return Optional.empty();
                            } catch (IllegalArgumentException unused22) {
                                return Optional.of(zzaup.zzd);
                            }
                        } catch (zzavu unused23) {
                            return Optional.of(zzaup.zzx);
                        }
                    case 10:
                        int[] iArr = {1944216249, 348137722, 926438168, 13122018, 1882968836, -1273372307, 246144337, 1723705710, 1677157265};
                        int i = iArr[0];
                        int i2 = iArr[1];
                        int i3 = iArr[2];
                        int i4 = iArr[3];
                        int i5 = iArr[4];
                        int i6 = iArr[5];
                        int i7 = iArr[6];
                        int i8 = iArr[7];
                        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
                        int i10 = i8 % 1677157265;
                        zzawa zzawaVar4 = (zzawa) obj;
                        try {
                            try {
                                zzavw zzavwVar12 = zzawaVar4.zzb;
                                long jZzm8 = zzavwVar12.zzc().zzm();
                                zzauv zzauvVar = zzawaVar4.zza;
                                zzavw zzavwVar13 = new zzavw(i10 ^ i9);
                                for (int i11 = 0; i11 < zzavwVar12.zzb; i11++) {
                                    try {
                                        zzavwVar13.zzb(zzawf.zzj((zzawf) zzavwVar12.zza.get(i11)));
                                    } catch (zzavv e) {
                                        throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e);
                                    }
                                }
                                zzavo zzavoVar = zzawaVar4.zzd;
                                new zzawa(zzauvVar, zzavwVar13, new zzavo(zzavoVar.zzb, zzavoVar.zza, zzavoVar.zzc.zzc(), zzavoVar.zzd)).zzd.zza(jZzm8);
                                zzavwVar12.zzb(zzawf.zza(new zzavf()));
                                return Optional.empty();
                            } catch (zzavm | zzavn unused24) {
                                return Optional.of(zzaup.zzt);
                            }
                        } catch (zzavu unused25) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused26) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 11:
                        try {
                            zzavw zzavwVar14 = ((zzawa) obj).zzb;
                            zzavwVar14.zzb(zzawf.zza(zzavwVar14.zzc().zzi((Class) zzavwVar14.zzc().zzl())));
                            return Optional.empty();
                        } catch (zzavu unused27) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused28) {
                            return Optional.of(zzaup.zzp);
                        }
                    case 12:
                        try {
                            zzavw zzavwVar15 = ((zzawa) obj).zzb;
                            long jZzm9 = zzavwVar15.zzc().zzm();
                            long jZzm10 = zzavwVar15.zzc().zzm();
                            if (jZzm9 == 0) {
                                return Optional.of(zzaup.zzF);
                            }
                            zzavwVar15.zzb(zzawf.zzb(jZzm10 % jZzm9));
                            return Optional.empty();
                        } catch (zzavu unused29) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused30) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 13:
                        try {
                            zzavw zzavwVar16 = ((zzawa) obj).zzb;
                            zzavwVar16.zzb(zzawf.zzc(zzavwVar16.zzc().zzq() * zzavwVar16.zzc().zzq()));
                            return Optional.empty();
                        } catch (zzavu unused31) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused32) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 14:
                        try {
                            zzavw zzavwVar17 = ((zzawa) obj).zzb;
                            zzavwVar17.zzb(zzawf.zzb(zzavwVar17.zzc().zzm() * zzavwVar17.zzc().zzm()));
                            return Optional.empty();
                        } catch (zzavu unused33) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused34) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 15:
                        try {
                            zzavw zzavwVar18 = ((zzawa) obj).zzb;
                            long jZzm11 = zzavwVar18.zzc().zzm();
                            ArrayList arrayList = new ArrayList();
                            for (long j2 = 0; j2 < jZzm11; j2++) {
                                arrayList.add(zzavwVar18.zzc());
                            }
                            Collections.reverse(arrayList);
                            zzavwVar18.zzb(zzawf.zze(arrayList));
                            return Optional.empty();
                        } catch (zzavu unused35) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused36) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 16:
                        try {
                            zzavw zzavwVar19 = ((zzawa) obj).zzb;
                            zzavwVar19.zzb(zzawf.zzc(Math.pow(zzavwVar19.zzc().zzq(), zzavwVar19.zzc().zzq())));
                            return Optional.empty();
                        } catch (zzavu unused37) {
                            return Optional.of(zzaup.zzx);
                        } catch (zzawc unused38) {
                            return Optional.of(zzaup.zzy);
                        }
                    case 17:
                        try {
                            ((zzawa) obj).zzb.zzb(zzawf.zza(null));
                            return Optional.empty();
                        } catch (zzavv unused39) {
                            return Optional.of(zzaup.zza);
                        }
                    case 18:
                        zzawa zzawaVar5 = (zzawa) obj;
                        try {
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(zzawaVar5.zzd.zzf((((((~1201162069L) & 403189074) | 1043752718) + ((1201162069 & 95979632) | 900760100)) - 1766798336) ^ (507611410 % 329370448)).zza());
                            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                            zzawaVar5.zzb.zzb(zzawf.zzc(Double.longBitsToDouble(byteBufferWrap.getLong())));
                            return Optional.empty();
                        } catch (zzavn unused40) {
                            return Optional.of(zzaup.zzz);
                        } catch (zzavv unused41) {
                            return Optional.of(zzaup.zza);
                        }
                    case 19:
                        zzawa zzawaVar6 = (zzawa) obj;
                        try {
                            zzawaVar6.zzb.zzb(zzawf.zzb(zzawaVar6.zzd.zze()));
                            return Optional.empty();
                        } catch (zzavl unused42) {
                            return Optional.of(zzaup.zzD);
                        } catch (zzavn unused43) {
                            return Optional.of(zzaup.zzz);
                        } catch (zzavv unused44) {
                            return Optional.of(zzaup.zza);
                        }
                    default:
                        long j3 = ((((~346030096L) & 203234088) | 575197286) + ((346030096 & 2352425736L) | 2745332883L)) - 1505840317;
                        long j4 = 1246101662 % 372004513;
                        long j5 = ((((~1810821955L) & 1747262537) | 563863662) + ((1810821955 & 1295301633) | 94020008)) - 1690999106;
                        long j6 = 1675644664 % 749217043;
                        zzawa zzawaVar7 = (zzawa) obj;
                        try {
                            zzavo zzavoVar2 = zzawaVar7.zzd;
                            long jZze = zzavoVar2.zze();
                            if (jZze >= 0 && jZze <= (j3 ^ j4)) {
                                if (((j5 ^ j6) & jZze) != 0) {
                                    return Optional.of(zzaup.zze);
                                }
                                zzawaVar7.zzb.zzb(zzawf.zzd(zzavoVar2.zzf(jZze)));
                                return Optional.empty();
                            }
                            return Optional.of(zzaup.zzz);
                        } catch (zzavl unused45) {
                            return Optional.of(zzaup.zzD);
                        } catch (zzavn unused46) {
                            return Optional.of(zzaup.zzz);
                        } catch (zzavv unused47) {
                            return Optional.of(zzaup.zza);
                        }
                }
            } catch (zzavv e2) {
                e = e2;
                throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzavm e3) {
            e = e3;
            throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
