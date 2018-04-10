<#assign base=request.contextPath />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <title>tree</title>

</head>
<body class="easyui-layout">
<div data-options="region:'north',title:'标题',split:true" style="height:100px;">
    <h1>金科员工管理系统</h1>
</div>
<div data-options="region:'west',title:'导航菜单',split:true" style="width:150px;">
    <ul id="menu-tree"></ul>
</div>
<div data-options="region:'center',title:'内容'" style="padding:5px;background:#eee;">
    <div id="tt" class="easyui-tabs" data-options="fit:true">
    </div>
</div>
<!-- 引入JQuery -->
<script type="text/javascript" src="<%=request.getContextPath()%>/EasyUI/jquery.min.js"></script>
<!-- 引入EasyUI -->
<script type="text/javascript" src="<%=request.getContextPath()%>/EasyUI/jquery.easyui.min.js"></script>
<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
<script type="text/javascript" src="<%=request.getContextPath()%>/EasyUI/locale/easyui-lang-zh_CN.js"></script>
<!-- 支持tree组件的使用 -->
<script type="text/javascript" src="<%=request.getContextPath()%>/EasyUI/util-js.js"></script>
<script type="text/javascript">
    $(function(){
        $("#menu-tree").tree({
            url:'<%=request.getContextPath()%>/tree/queryTreeList.jhtml',
            parentField:'pid',
            onClick:function(node){
                if(node.url != null && node.url != ""){
                    addtabs(node.url,node.text);
                }
            }
        })
    })

    function addtabs(urlcolo,titlename){
        var flag = $('#tt').tabs('exists',titlename);
        if(flag){
            $('#tt').tabs('select',titlename);
        }else{
            $('#tt').tabs('add',{
                title:titlename,
                href:"<%=request.getContextPath()%>/"+urlcolo,
                closable:true,
                tools:[{
                    iconCls:'icon-mini-refresh',
                    handler:function(){
                        alert('refresh');
                    }
                }]
            });
        }

    }
</script>
</body>
</html>
