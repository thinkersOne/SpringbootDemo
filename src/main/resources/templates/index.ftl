<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>${map.book}</h1>
    <#-- 使用FTL指令 -->
    <table>
        <tr>
            <td>编号</td>
            <td>书名</td>
            <td>价格</td>
        </tr>
        <#if books?exists>
            <#list books as key>
               <tr>
                   <td>${key.id}</td>
                   <td>${key.name}</td>
                   <td>${key.price}</td>
               </tr>
            </#list>
        </#if>
        <tr>
            <td>
                <span>总数${total}</span>
                <a href="/getBook?page=1">首页</a>
                <#if total?exists>
                    <#list 1..total as key>
                        <a href="/getBook?page=${key}">${key}</a>
                    </#list>
                </#if>
                <a href="/getBook?page=${total}">尾页</a>
            </td>
        </tr>
    </table>
</body>
</html>