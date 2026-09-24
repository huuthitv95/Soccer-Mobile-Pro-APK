package com.bytedance.sdk.openadsdk.utils;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C3586sf {

    /* JADX INFO: renamed from: ri */
    private static final Map<String, Pair<? extends Drawable, Integer>> f13252ri = new HashMap();

    /* JADX INFO: renamed from: lr */
    private static Integer f13251lr = null;

    /* JADX INFO: renamed from: ri */
    public static Drawable m16643ri(Context context, int i) {
        return m16644ri(context, Color.parseColor("#1A73E8"), i);
    }

    /* JADX INFO: renamed from: ri */
    public static Drawable m16644ri(Context context, int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(C3583qd.m16589lr(context, i2));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ri */
    public static Drawable m16645ri(Context context, String str) {
        return m16646ri(context, str, true);
    }

    /* JADX INFO: renamed from: ri */
    public static Drawable m16646ri(Context context, String str, boolean z) {
        Pair<? extends Drawable, Integer> pair;
        f13251lr = Integer.valueOf(C3299nr.m14639ka().m14835co());
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = f13252ri;
        Integer.valueOf(map.size());
        if (!map.containsKey(str) || (pair = map.get(str)) == null) {
            m16650ri();
            return m16647ri(str, context, z);
        }
        Drawable drawable = (Drawable) pair.first;
        map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
        return drawable;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    private static Drawable m16647ri(String str, Context context, boolean z) {
        byte b;
        Drawable layerDrawable;
        Drawable drawableM16649ri;
        str.hashCode();
        switch (str.hashCode()) {
            case -2137782317:
                b = !str.equals("tt_leftbackicon_selector_for_dark") ? (byte) -1 : (byte) 0;
                break;
            case -2023672829:
                b = !str.equals("tt_dislike_dialog_bg") ? (byte) -1 : (byte) 1;
                break;
            case -2010340681:
                b = !str.equals("tt_leftbackbutton_titlebar_photo_preview") ? (byte) -1 : (byte) 2;
                break;
            case -1888785259:
                b = !str.equals("tt_seek_progress") ? (byte) -1 : (byte) 3;
                break;
            case -1883903877:
                b = !str.equals("tt_dislike_middle_seletor") ? (byte) -1 : (byte) 4;
                break;
            case -1881901373:
                b = !str.equals("tt_ad_cover_btn_begin_bg") ? (byte) -1 : (byte) 5;
                break;
            case -1818605128:
                b = !str.equals("tt_leftbackicon_selector") ? (byte) -1 : (byte) 6;
                break;
            case -1724866088:
                b = !str.equals("tt_seek_thumb_normal") ? (byte) -1 : (byte) 7;
                break;
            case -1698792361:
                b = !str.equals("tt_stop_movebar_textpage") ? (byte) -1 : (byte) 8;
                break;
            case -1500492368:
                b = !str.equals("tt_backup_btn_1") ? (byte) -1 : (byte) 9;
                break;
            case -1308443384:
                b = !str.equals("tt_ad_report_info_bg") ? (byte) -1 : (byte) 10;
                break;
            case -1222892514:
                b = !str.equals("tt_playable_btn_bk") ? (byte) -1 : Ascii.f22503VT;
                break;
            case -1163545839:
                b = !str.equals("tt_dislike_bottom_seletor") ? (byte) -1 : Ascii.f22492FF;
                break;
            case -1150582740:
                b = !str.equals("tt_seek_thumb_fullscreen") ? (byte) -1 : Ascii.f22490CR;
                break;
            case -1147412691:
                b = !str.equals("tt_custom_dialog_bg") ? (byte) -1 : Ascii.f22500SO;
                break;
            case -1107858393:
                b = !str.equals("tt_ad_loading_three_mid") ? (byte) -1 : Ascii.f22499SI;
                break;
            case -876774215:
                b = !str.equals("tt_close_move_detail") ? (byte) -1 : Ascii.DLE;
                break;
            case -875200849:
                b = !str.equals("tt_mute_btn_bg") ? (byte) -1 : (byte) 17;
                break;
            case -847552402:
                b = !str.equals("tt_seek_thumb") ? (byte) -1 : Ascii.DC2;
                break;
            case -561153052:
                b = !str.equals("tt_reward_countdown_bg") ? (byte) -1 : (byte) 19;
                break;
            case -508263579:
                b = !str.equals("tt_play_movebar_textpage") ? (byte) -1 : Ascii.DC4;
                break;
            case -473198695:
                b = !str.equals("tt_refreshing_video_textpage") ? (byte) -1 : Ascii.NAK;
                break;
            case -404284879:
                b = !str.equals("tt_playable_progress_style") ? (byte) -1 : Ascii.SYN;
                break;
            case -292612462:
                b = !str.equals("tt_seek_thumb_fullscreen_selector") ? (byte) -1 : Ascii.ETB;
                break;
            case -226695937:
                b = !str.equals("tt_ad_landing_loading_three_mid") ? (byte) -1 : Ascii.CAN;
                break;
            case -154809169:
                b = !str.equals("tt_pangle_ad_mute_btn_bg") ? (byte) -1 : Ascii.f22491EM;
                break;
            case -97103333:
                b = !str.equals("tt_video_black_desc_gradient") ? (byte) -1 : Ascii.SUB;
                break;
            case 16094728:
                b = !str.equals("tt_ad_loading_three_left") ? (byte) -1 : Ascii.ESC;
                break;
            case 27541452:
                b = !str.equals("tt_mute_wrapper") ? (byte) -1 : Ascii.f22493FS;
                break;
            case 57270120:
                b = !str.equals("tt_dislike_top_bg") ? (byte) -1 : Ascii.f22494GS;
                break;
            case 106179457:
                b = !str.equals("tt_comment_tv") ? (byte) -1 : Ascii.f22498RS;
                break;
            case 242455215:
                b = !str.equals("tt_reward_full_new_bar_bg") ? (byte) -1 : Ascii.f22502US;
                break;
            case 247520514:
                b = !str.equals("tt_reward_full_video_backup_btn_bg") ? (byte) -1 : (byte) 32;
                break;
            case 310787585:
                b = !str.equals("tt_full_reward_loading_progress_style") ? (byte) -1 : (byte) 33;
                break;
            case 314734139:
                b = !str.equals("tt_detail_video_btn_bg") ? (byte) -1 : (byte) 34;
                break;
            case 410262782:
                b = !str.equals("tt_pangle_banner_btn_bg") ? (byte) -1 : (byte) 35;
                break;
            case 484030064:
                b = !str.equals("tt_seek_thumb_fullscreen_press") ? (byte) -1 : (byte) 36;
                break;
            case 494589792:
                b = !str.equals("tt_browser_download_selector") ? (byte) -1 : (byte) 37;
                break;
            case 504597563:
                b = !str.equals("tt_ad_loading_three_right") ? (byte) -1 : (byte) 38;
                break;
            case 507305701:
                b = !str.equals("tt_pangle_btn_bg") ? (byte) -1 : (byte) 39;
                break;
            case 708409173:
                b = !str.equals("tt_privacy_progress_style") ? (byte) -1 : (byte) 40;
                break;
            case 991946046:
                b = !str.equals("tt_privacy_btn_bg") ? (byte) -1 : (byte) 41;
                break;
            case 1054661938:
                b = !str.equals("tt_seek_thumb_press") ? (byte) -1 : (byte) 42;
                break;
            case 1094767909:
                b = !str.equals("tt_unmute_wrapper") ? (byte) -1 : (byte) 43;
                break;
            case 1115144587:
                b = !str.equals("tt_titlebar_close_seletor_for_dark") ? (byte) -1 : (byte) 44;
                break;
            case 1193160467:
                b = !str.equals("tt_ad_landing_loading_three_right") ? (byte) -1 : (byte) 45;
                break;
            case 1234814491:
                b = !str.equals("tt_landingpage_loading_text_rect") ? (byte) -1 : (byte) 46;
                break;
            case 1241312517:
                b = !str.equals("tt_shadow_btn_back_withoutnight") ? (byte) -1 : (byte) 47;
                break;
            case 1360033453:
                b = !str.equals("tt_circle_solid_mian") ? (byte) -1 : (byte) 48;
                break;
            case 1391934389:
                b = !str.equals("tt_browser_progress_style") ? (byte) -1 : (byte) 49;
                break;
            case 1459143575:
                b = !str.equals("tt_download_corner_bg") ? (byte) -1 : (byte) 50;
                break;
            case 1473061455:
                b = !str.equals("tt_ad_report_info_button_bg") ? (byte) -1 : (byte) 51;
                break;
            case 1562327088:
                b = !str.equals("tt_ad_landing_loading_three_left") ? (byte) -1 : (byte) 52;
                break;
            case 1635801742:
                b = !str.equals("tt_pangle_ad_close_btn_bg") ? (byte) -1 : (byte) 53;
                break;
            case 1733712735:
                b = !str.equals("tt_lefterbackicon_titlebar_press_wrapper") ? (byte) -1 : (byte) 54;
                break;
            case 1859118378:
                b = !str.equals("tt_reward_video_download_btn_bg") ? (byte) -1 : (byte) 55;
                break;
            case 1908435428:
                b = !str.equals("tt_ad_loading_rect") ? (byte) -1 : (byte) 56;
                break;
            case 1967077738:
                b = !str.equals("tt_shadow_btn_back") ? (byte) -1 : (byte) 57;
                break;
            case 1986221289:
                b = !str.equals("tt_dislike_top_seletor") ? (byte) -1 : (byte) 58;
                break;
            case 1987199879:
                b = !str.equals("tt_video_loading_progress_bar") ? (byte) -1 : (byte) 59;
                break;
            case 1995246663:
                b = !str.equals("tt_ad_skip_btn_bg2") ? (byte) -1 : (byte) 60;
                break;
            case 2051103617:
                b = !str.equals("tt_privacy_webview_bg") ? (byte) -1 : Base64.padSymbol;
                break;
            case 2091139328:
                b = !str.equals("tt_titlebar_close_seletor") ? (byte) -1 : (byte) 62;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                drawableM16649ri = m16649ri(C2729uq.m10303ik(context, "tt_lefterbackicon_titlebar_press_for_dark"), C2729uq.m10303ik(context, "tt_lefterbackicon_titlebar_for_dark"));
                break;
            case 1:
                drawableM16649ri = m16648ri(0, -1, new int[]{C3583qd.m16589lr(context, 8.0f)}, null, null, null);
                break;
            case 2:
                drawableM16649ri = m16649ri(C2729uq.m10303ik(context, "tt_white_lefterbackicon_titlebar_press"), C2729uq.m10303ik(context, "tt_white_lefterbackicon_titlebar"));
                break;
            case 3:
                layerDrawable = new LayerDrawable(new Drawable[]{m16648ri(0, Integer.valueOf(Color.parseColor("#A5FFFFFF")), new int[]{C3583qd.m16589lr(context, 1.5f)}, new int[]{-1, C3583qd.m16589lr(context, 1.0f)}, null, null), new ClipDrawable(m16648ri(0, -1, new int[]{C3583qd.m16589lr(context, 1.5f)}, new int[]{-1, C3583qd.m16589lr(context, 1.0f)}, null, null), GravityCompat.START, 1), new ClipDrawable(m16648ri(0, Integer.valueOf(Color.parseColor("#fff85959")), new int[]{C3583qd.m16589lr(context, 1.5f)}, new int[]{-1, C3583qd.m16589lr(context, 1.0f)}, null, null), GravityCompat.START, 1)});
                drawableM16649ri = layerDrawable;
                break;
            case 4:
                drawableM16649ri = m16649ri(m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_fde6e6e6")), null, null, null, null), m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_fdffffff")), null, null, null, null));
                break;
            case 5:
                drawableM16649ri = m16649ri(m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_2a90d7")), new int[]{C3583qd.m16589lr(context, 6.0f)}, null, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), Integer.valueOf(C2729uq.xha(context, "@color/tt_7f2a90d7"))), m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_2a90d7")), new int[]{C3583qd.m16589lr(context, 6.0f)}, null, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), Integer.valueOf(C2729uq.xha(context, "@color/tt_2a90d7"))));
                break;
            case 6:
                drawableM16649ri = C2729uq.m10303ik(context, "tt_lefterbackicon_titlebar");
                break;
            case 7:
                drawableM16649ri = m16648ri(1, -1, null, new int[]{C3583qd.m16589lr(context, 15.0f), C3583qd.m16589lr(context, 15.0f)}, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), 0);
                break;
            case 8:
                drawableM16649ri = m16649ri(C2729uq.m10303ik(context, "tt_new_pause_video_press"), C2729uq.m10303ik(context, "tt_new_pause_video"));
                break;
            case 9:
                drawableM16649ri = m16649ri(m16648ri(0, Integer.valueOf(Color.parseColor("#33f32830")), new int[]{C3583qd.m16589lr(context, 4.0f)}, null, null, null), m16648ri(0, Integer.valueOf(Color.parseColor("#f32830")), new int[]{C3583qd.m16589lr(context, 4.0f)}, null, null, null));
                break;
            case 10:
                drawableM16649ri = m16648ri(0, -1, new int[]{C3583qd.m16589lr(context, 12.0f), C3583qd.m16589lr(context, 12.0f), 0, 0}, null, null, null);
                break;
            case 11:
                drawableM16649ri = m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_00000000")), new int[]{C3583qd.m16589lr(context, 30.0f)}, null, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), -1);
                break;
            case 12:
                drawableM16649ri = m16649ri(m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_fde6e6e6")), new int[]{0, 0, C3583qd.m16589lr(context, 5.0f), C3583qd.m16589lr(context, 5.0f)}, null, null, null), m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_fdffffff")), new int[]{0, 0, C3583qd.m16589lr(context, 5.0f), C3583qd.m16589lr(context, 5.0f)}, null, null, null));
                break;
            case 13:
                drawableM16649ri = m16648ri(1, -1, null, new int[]{C3583qd.m16589lr(context, 18.0f), C3583qd.m16589lr(context, 18.0f)}, null, null);
                break;
            case 14:
                drawableM16649ri = m16648ri(0, -1, new int[]{C3583qd.m16589lr(context, 6.0f)}, null, Integer.valueOf(C3583qd.m16589lr(context, 0.8f)), -1);
                break;
            case 15:
                drawableM16649ri = m16648ri(0, null, null, null, Integer.valueOf(C3583qd.m16589lr(context, 1.5f)), -1);
                break;
            case 16:
                drawableM16649ri = m16649ri(C2729uq.m10303ik(context, "tt_close_move_details_pressed"), C2729uq.m10303ik(context, "tt_close_move_details_normal"));
                break;
            case 17:
                drawableM16649ri = m16648ri(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{C3583qd.m16589lr(context, 28.0f), C3583qd.m16589lr(context, 28.0f)}, null, null);
                break;
            case 18:
                drawableM16649ri = m16649ri(m16648ri(1, -1, null, new int[]{C3583qd.m16589lr(context, 22.0f), C3583qd.m16589lr(context, 22.0f)}, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), 0), m16648ri(1, -1, null, new int[]{C3583qd.m16589lr(context, 15.0f), C3583qd.m16589lr(context, 15.0f)}, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), 0));
                break;
            case 19:
                drawableM16649ri = m16648ri(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{C3583qd.m16589lr(context, 28.0f), C3583qd.m16589lr(context, 28.0f)}, null, null);
                break;
            case 20:
                drawableM16649ri = m16649ri(C2729uq.m10303ik(context, "tt_new_play_video"), C2729uq.m10303ik(context, "tt_new_play_video"));
                break;
            case 21:
                drawableM16649ri = m16649ri(C2729uq.m10303ik(context, "tt_refreshing_video_textpage_pressed"), C2729uq.m10303ik(context, "tt_refreshing_video_textpage_normal"));
                break;
            case 22:
                layerDrawable = new LayerDrawable(new Drawable[]{m16648ri(0, Integer.valueOf(Color.parseColor("#4DFC625C")), new int[]{C3583qd.m16589lr(context, 3.0f)}, null, null, null), new ClipDrawable(m16648ri(0, Integer.valueOf(Color.parseColor("#FC625C")), new int[]{C3583qd.m16589lr(context, 3.0f)}, null, null, null), GravityCompat.START, 1)});
                drawableM16649ri = layerDrawable;
                break;
            case 23:
                drawableM16649ri = m16649ri(m16648ri(1, -1, null, new int[]{C3583qd.m16589lr(context, 18.0f), C3583qd.m16589lr(context, 18.0f)}, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), 0), m16648ri(1, -1, null, new int[]{C3583qd.m16589lr(context, 18.0f), C3583qd.m16589lr(context, 18.0f)}, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), 0));
                break;
            case 24:
                drawableM16649ri = m16648ri(0, null, null, null, Integer.valueOf(C3583qd.m16589lr(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case 25:
                drawableM16649ri = m16648ri(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{C3583qd.m16589lr(context, 28.0f), C3583qd.m16589lr(context, 28.0f)}, null, null);
                break;
            case 26:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{C2729uq.xha(context, "tt_ff1a1a1a"), C2729uq.xha(context, "tt_00000000")});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                layerDrawable = gradientDrawable;
                drawableM16649ri = layerDrawable;
                break;
            case 27:
                drawableM16649ri = m16648ri(0, null, new int[]{C3583qd.m16589lr(context, 6.0f), 0, 0, C3583qd.m16589lr(context, 6.0f)}, null, Integer.valueOf(C3583qd.m16589lr(context, 1.5f)), -1);
                break;
            case 28:
                Drawable drawableM10303ik = C2729uq.m10303ik(context, "tt_mute");
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[0], drawableM10303ik);
                stateListDrawable.setAutoMirrored(true);
                layerDrawable = stateListDrawable;
                drawableM16649ri = layerDrawable;
                break;
            case 29:
                drawableM16649ri = m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_fdffffff")), new int[]{C3583qd.m16589lr(context, 5.0f), C3583qd.m16589lr(context, 5.0f), 0, 0}, null, null, null);
                break;
            case 30:
                drawableM16649ri = m16648ri(0, -1, new int[]{C3583qd.m16589lr(context, 4.0f)}, null, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), Integer.valueOf(Color.parseColor("#0F161823")));
                break;
            case 31:
                drawableM16649ri = m16648ri(0, Integer.valueOf(Color.parseColor("#ccffffff")), new int[]{C3583qd.m16589lr(context, 18.0f)}, null, null, null);
                break;
            case 32:
                drawableM16649ri = m16648ri(0, Integer.valueOf(Color.parseColor("#ff0088ff")), new int[]{C3583qd.m16589lr(context, 6.0f)}, null, null, null);
                break;
            case 33:
                GradientDrawable gradientDrawableM16648ri = m16648ri(0, Integer.valueOf(Color.parseColor("#EAEAEA")), new int[]{C3583qd.m16589lr(context, 50.0f)}, null, null, null);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(C3583qd.m16589lr(context, 15.0f));
                gradientDrawable2.setColors(new int[]{Color.parseColor("#1A73E8"), Color.parseColor("#569FFF")});
                gradientDrawable2.setGradientType(0);
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                drawableM16649ri = new LayerDrawable(new Drawable[]{gradientDrawableM16648ri, new ScaleDrawable(gradientDrawable2, GravityCompat.START, 1.0f, -1.0f)});
                break;
            case 34:
                drawableM16649ri = m16648ri(0, Integer.valueOf(Color.parseColor("#26000000")), new int[]{C3583qd.m16589lr(context, 4.0f)}, null, null, null);
                break;
            case 35:
                drawableM16649ri = m16648ri(0, Integer.valueOf(Color.parseColor("#ff2f87f8")), new int[]{C3583qd.m16589lr(context, 2.0f)}, new int[]{C3583qd.m16589lr(context, 98.0f), C3583qd.m16589lr(context, 25.0f)}, null, null);
                break;
            case 36:
                drawableM16649ri = m16648ri(1, -1, null, new int[]{C3583qd.m16589lr(context, 18.0f), C3583qd.m16589lr(context, 18.0f)}, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), 0);
                break;
            case 37:
                drawableM16649ri = m16649ri(m16648ri(0, Integer.valueOf(Color.parseColor("#2582c3")), null, null, null, null), m16648ri(0, Integer.valueOf(Color.parseColor("#2a90d7")), null, null, null, null));
                break;
            case 38:
                drawableM16649ri = m16648ri(0, null, new int[]{0, C3583qd.m16589lr(context, 6.0f), C3583qd.m16589lr(context, 6.0f), 0}, null, Integer.valueOf(C3583qd.m16589lr(context, 1.5f)), -1);
                break;
            case 39:
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setSize(C3583qd.m16589lr(context, 280.0f), C3583qd.m16589lr(context, 38.0f));
                gradientDrawable3.setCornerRadius(C3583qd.m16589lr(context, 19.0f));
                gradientDrawable3.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable3.setColors(new int[]{Color.parseColor("#fff02d42"), Color.parseColor("#fffc4b3c")});
                gradientDrawable3.setGradientType(0);
                gradientDrawable3.setUseLevel(true);
                layerDrawable = gradientDrawable3;
                drawableM16649ri = layerDrawable;
                break;
            case 40:
                drawableM16649ri = new LayerDrawable(new Drawable[]{m16648ri(0, Integer.valueOf(Color.parseColor("#33007AFF")), null, null, null, null), new ClipDrawable(m16648ri(0, Integer.valueOf(Color.parseColor("#007AFF")), null, null, null, null), GravityCompat.START, 1)});
                break;
            case 41:
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setSize(C3583qd.m16589lr(context, 258.0f), C3583qd.m16589lr(context, 43.0f));
                gradientDrawable4.setCornerRadius(C3583qd.m16589lr(context, 22.0f));
                gradientDrawable4.setColors(new int[]{Color.parseColor("#73CBFC"), Color.parseColor("#3F9CF7")});
                gradientDrawable4.setGradientType(0);
                layerDrawable = gradientDrawable4;
                drawableM16649ri = layerDrawable;
                break;
            case 42:
                drawableM16649ri = m16648ri(1, -1, null, new int[]{C3583qd.m16589lr(context, 22.0f), C3583qd.m16589lr(context, 22.0f)}, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), 0);
                break;
            case 43:
                Drawable drawableM10303ik2 = C2729uq.m10303ik(context, "tt_unmute");
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[0], drawableM10303ik2);
                stateListDrawable2.setAutoMirrored(true);
                layerDrawable = stateListDrawable2;
                drawableM16649ri = layerDrawable;
                break;
            case 44:
                drawableM16649ri = m16649ri(C2729uq.m10303ik(context, "tt_titlebar_close_press_for_dark"), C2729uq.m10303ik(context, "tt_titlebar_close_for_dark"));
                break;
            case 45:
                drawableM16649ri = m16648ri(0, null, new int[]{0, C3583qd.m16589lr(context, 6.0f), C3583qd.m16589lr(context, 6.0f), 0}, null, Integer.valueOf(C3583qd.m16589lr(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case 46:
                drawableM16649ri = m16648ri(0, Integer.valueOf(Color.parseColor("#141A73E8")), new int[]{C3583qd.m16589lr(context, 5.0f)}, null, null, null);
                break;
            case 47:
                Drawable drawableM10303ik3 = C2729uq.m10303ik(context, "tt_shadow_lefterback_titlebar_press_withoutnight");
                StateListDrawable stateListDrawableM16649ri = m16649ri(drawableM10303ik3, C2729uq.m10303ik(context, "tt_shadow_lefterback_titlebar_withoutnight"));
                stateListDrawableM16649ri.addState(new int[]{-16842910}, drawableM10303ik3);
                drawableM16649ri = stateListDrawableM16649ri;
                break;
            case 48:
                drawableM16649ri = m16648ri(1, Integer.valueOf(C2729uq.xha(context, "tt_e0e0e0")), null, null, null, null);
                break;
            case 49:
                drawableM16649ri = new LayerDrawable(new Drawable[]{m16648ri(0, -1, new int[]{0}, null, null, null), new ClipDrawable(m16648ri(0, Integer.valueOf(Color.parseColor("#1A73E8")), new int[]{0}, null, null, null), 3, 1)});
                break;
            case 50:
                drawableM16649ri = m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_4a90e2")), new int[]{C3583qd.m16589lr(context, 4.0f)}, null, null, null);
                break;
            case 51:
                drawableM16649ri = m16649ri(m16648ri(0, Integer.valueOf(Color.parseColor("#0D000000")), new int[]{C3583qd.m16589lr(context, 2.0f)}, null, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), Integer.valueOf(Color.parseColor("#1F000000"))), m16648ri(0, -1, new int[]{C3583qd.m16589lr(context, 2.0f)}, null, Integer.valueOf(C3583qd.m16589lr(context, 1.0f)), Integer.valueOf(Color.parseColor("#1618231F"))));
                break;
            case 52:
                drawableM16649ri = m16648ri(0, null, new int[]{C3583qd.m16589lr(context, 6.0f), 0, 0, C3583qd.m16589lr(context, 6.0f)}, null, Integer.valueOf(C3583qd.m16589lr(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case 53:
                drawableM16649ri = m16648ri(1, Integer.valueOf(Color.parseColor("#30333333")), null, new int[]{C3583qd.m16589lr(context, 28.0f), C3583qd.m16589lr(context, 28.0f)}, null, null);
                break;
            case 54:
                Drawable drawableM10303ik4 = C2729uq.m10303ik(context, "tt_lefterbackicon_titlebar_press");
                StateListDrawable stateListDrawable3 = new StateListDrawable();
                stateListDrawable3.addState(new int[0], drawableM10303ik4);
                stateListDrawable3.setAutoMirrored(true);
                layerDrawable = stateListDrawable3;
                drawableM16649ri = layerDrawable;
                break;
            case 55:
                drawableM16649ri = m16648ri(0, Integer.valueOf(Color.parseColor("#ff007aff")), new int[]{C3583qd.m16589lr(context, 18.0f)}, null, null, null);
                break;
            case 56:
                drawableM16649ri = m16648ri(0, Integer.valueOf(Color.parseColor("#33FFFFFF")), new int[]{C3583qd.m16589lr(context, 15.0f)}, null, null, null);
                break;
            case 57:
                Drawable drawableM10303ik5 = C2729uq.m10303ik(context, "tt_shadow_lefterback_titlebar_press");
                StateListDrawable stateListDrawableM16649ri2 = m16649ri(drawableM10303ik5, C2729uq.m10303ik(context, "tt_shadow_lefterback_titlebar"));
                stateListDrawableM16649ri2.addState(new int[]{-16842910}, drawableM10303ik5);
                drawableM16649ri = stateListDrawableM16649ri2;
                break;
            case 58:
                drawableM16649ri = m16649ri(m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_fde6e6e6")), new int[]{C3583qd.m16589lr(context, 5.0f), C3583qd.m16589lr(context, 5.0f), 0, 0}, null, null, null), m16648ri(0, Integer.valueOf(C2729uq.xha(context, "tt_fdffffff")), new int[]{C3583qd.m16589lr(context, 5.0f), C3583qd.m16589lr(context, 5.0f), 0, 0}, null, null, null));
                break;
            case 59:
                RotateDrawable rotateDrawable = new RotateDrawable();
                rotateDrawable.setDrawable(C2729uq.m10303ik(context, "tt_normalscreen_loading"));
                rotateDrawable.setFromDegrees(0.0f);
                rotateDrawable.setToDegrees(360.0f);
                rotateDrawable.setPivotX(0.5f);
                rotateDrawable.setPivotY(0.5f);
                layerDrawable = rotateDrawable;
                drawableM16649ri = layerDrawable;
                break;
            case 60:
                drawableM16649ri = m16648ri(0, Integer.valueOf(Color.parseColor("#66161823")), new int[]{C3583qd.m16589lr(context, 14.0f)}, null, null, null);
                break;
            case 61:
                drawableM16649ri = m16648ri(0, -1, new int[]{C3583qd.m16589lr(context, 14.5f)}, null, null, null);
                break;
            case 62:
                drawableM16649ri = C2729uq.m10303ik(context, "tt_titlebar_close_drawable");
                break;
            default:
                drawableM16649ri = null;
                break;
        }
        if (z) {
            f13252ri.put(str, new Pair<>(drawableM16649ri, 1));
        }
        return drawableM16649ri;
    }

    /* JADX INFO: renamed from: ri */
    private static GradientDrawable m16648ri(int i, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i2, i2, i3, i3, i4, i4, i5, i5});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ri */
    private static StateListDrawable m16649ri(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: ri */
    private static void m16650ri() {
        Map<String, Pair<? extends Drawable, Integer>> map = f13252ri;
        if (map.size() < f13251lr.intValue()) {
            return;
        }
        String key = null;
        int iIntValue = Integer.MAX_VALUE;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        f13252ri.remove(key);
    }
}
