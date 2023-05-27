const form = document.getElementById('signup-form');
const passwordInput = document.getElementById('password');
const confirmPasswordInput = document.getElementById('confirm-password');
const errorDiv = document.getElementById('error-div');
const successDiv = document.getElementById('success-div');

form.addEventListener('submit', function(e) {
  e.preventDefault();
  let hasError = false;
  let errorMessage = '';

  // check if any field is empty
  const inputs = form.querySelectorAll('input:not([type="submit"])');
  for (let input of inputs) {
    if (!input.value) {
      hasError = true;
      errorMessage = 'Please fill in all fields';
      input.classList.add('error');
    } else {
      input.classList.remove('error');
    }
  }

  // check if password and confirm password match
  if (passwordInput.value !== confirmPasswordInput.value) {
    hasError = true;
    errorMessage = 'Passwords do not match';
    passwordInput.classList.add('error');
    confirmPasswordInput.classList.add('error');
  } else {
    passwordInput.classList.remove('error');
    confirmPasswordInput.classList.remove('error');
  }

  // show error message if there is an error
  if (hasError) {
    errorDiv.innerHTML = errorMessage;
    successDiv.style.display = 'none';
    errorDiv.style.display = 'block';
  } else {
    form.reset();
    successDiv.style.display = 'block';
    errorDiv.style.display = 'none';
  }
});
