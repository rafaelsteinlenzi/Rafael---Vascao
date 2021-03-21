$(function() {
    $("#txt").val("texto alterado com jquery");
    $(".email").val("texto alterado com jquery pela classe");

    //$("p:not(.destaque), li").css("opacity", ".75");
    //$("p, li").css("color", "#999");
    //$(".container > ul > li").css("color", "black");

    $(".destaque ~ p").addClass("destaque");
    $("li:first").css("color", "green");
    $("li:first-child").css("color", "green");
    $("li:last").css("color", "green");
    $("li:last-child").css("color", "green");
    $("p:lt(2)").css({
        "color":"orange",
        fontSize: "22px"
    })
    $("a[title]").css("color", "red");
    $("a:not([title])").hide();
    $("li:odd").css("backgroundColor", "white");
    $("li:even").css("backgroundColor", "black");
    $("p:contains(afo 6)").css("color", "orange");
    $("p:contains(afo 7)").css("color", "red");
    $("p:has(i)").css("color", "blue");
    $("p:empty").text("este parágrafo estava vazio Joaozinho #jetzt geht's los!");
    $("p:hidden").show();

});