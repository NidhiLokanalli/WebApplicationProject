function saveCell() {
    const cellId = prompt("Enter Cell ID (e.g., A1):");
    const content = prompt("Enter Content:");
    const formula = prompt("Enter Formula:");

    fetch('/api/cells', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ rowColumnId: cellId, content: content, formula: formula })
    }).then(() => alert("Cell Saved!"));
}

function calculateSum() {
    const cellIds = prompt("Enter Cell IDs separated by commas (e.g., A1,A2):").split(",");
    fetch(/api/cells/sum?cellIds=${cellIds.join(",")})
        .then(response => response.json())
        .then(sum => alert("SUM: " + sum));
}