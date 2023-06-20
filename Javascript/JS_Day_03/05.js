document.querySelector("#img").addEventListener("mouseover", function()
{
    document.querySelector("#img").style.width = "800px";
    document.querySelector("#img").style.height = "800px";

}),
document.querySelector("#img").addEventListener("mouseleave", function()
{
    document.querySelector("#img").style.width = "200px";
    document.querySelector("#img").style.height = "200px";

});
