# JAVAOOPS
java oops by akash

@model IEnumerable<dynamic>

@{
    ViewBag.Title = "Dynamic Grid View";
}

<h2>@ViewBag.Title</h2>

@if (Model != null && Model.Count() > 0)
{
    <div class="grid-container">
        <div class="grid-header">
            @foreach (var property in Model.First().GetType().GetProperties())
            {
                <div class="grid-cell">@property.Name</div>
            }
        </div>
        <div class="grid-body">
            @foreach (var item in Model)
            {
                <div class="grid-row">
                    @foreach (var property in item.GetType().GetProperties())
                    {
                        <div class="grid-cell">@property.GetValue(item)</div>
                    }
                </div>
            }
        </div>
    </div>
}
else
{
    <p>No data to display.</p>
}
