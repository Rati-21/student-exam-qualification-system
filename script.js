document.getElementById("marksForm").addEventListener("submit", function(event) {
  event.preventDefault();

  let test1 = parseFloat(document.getElementById("test1").value);
  let test2 = parseFloat(document.getElementById("test2").value);
  let assignment = parseFloat(document.getElementById("assignment").value);
  let project = parseFloat(document.getElementById("project").value);

  let average = (test1 * 0.3) + (test2 * 0.5) + (assignment * 0.1) + (project * 0.1);

  let result = document.getElementById("result");
  result.innerHTML = `Average: ${average.toFixed(2)}%<br>`;

  if (average >= 50) {
    result.innerHTML += `<span style="color: green;"> You Qualify</span>`;
  } else {
    result.innerHTML += `<span style="color: red;"> You Do Not Qualify</span>`;
  }
});
